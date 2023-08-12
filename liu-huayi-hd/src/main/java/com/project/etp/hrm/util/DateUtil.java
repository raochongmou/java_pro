package com.project.etp.hrm.util;



import com.project.etp.hrm.exception.BusinessException;
import com.project.etp.hrm.exception.ExceptionStatusCode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: 刘胜
 * @DateTime: 2021/11/8 9:34
 * @e-mail: it.wizard@foxmail.com
 * @Description: TODO
 */
public class DateUtil {

    /**
     * 某两个日期直接的天数差
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public static Integer diff(Date startDate, Date endDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            startDate = sdf.parse(sdf.format(startDate));
            endDate = sdf.parse(sdf.format(endDate));
        } catch (ParseException e) {
            e.printStackTrace();
            throw new BusinessException(ExceptionStatusCode.ERROR_DATE_FORMAT);
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(startDate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(endDate);
        long time2 = cal.getTimeInMillis();
        long betweenDays = (time2 - time1) / (1000 * 3600 * 24);
        return Integer.parseInt(String.valueOf(betweenDays));
    }

    public static Date now() {
        LocalDateTime datetime = LocalDateTime.now(ZoneId.of("Asia/Shanghai"));
        ZonedDateTime zdt = datetime.atZone(ZoneId.systemDefault());
        return Date.from(zdt.toInstant());
    }

    /**
     * 无参 获取当前时间戳的
     *
     * @return
     */
    public static String nowTimeStamp() {
        return nowStr(DateFormat.YMDHMS);
    }

    /**
     * 无参的获取当前时间，yyyy-MM-dd
     *
     * @return
     */
    public static String nowDate() {
        return nowStr(DateFormat.DATE);
    }

    /**
     * 无参的 获取当前时间 yyyy-MM-dd HH:mm:ss
     *
     * @return
     */
    public static String nowDateTime() {
        return format(now(), DateFormat.DATE_TIME);
    }

    /**
     * 获取当前时间的 string
     *
     * @param dateFormat
     * @return
     */
    public static String nowStr(DateFormat dateFormat) {
        return format(now(), dateFormat);
    }

    /**
     * 格式化日期 建议使用当前枚举类型的格式
     *
     * @param date
     * @param dateFormat
     * @return
     */
    public static String format(Date date, DateFormat dateFormat) {
        return format(date, dateFormat.getFormat());
    }

    private static String format(Date date, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    public static Date parse(String dateStr, DateFormat dateFormat) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat.getFormat());
        try {
            return simpleDateFormat.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 某个月  加 一个月份
     *
     * @param date 日期
     * @param i    加几个月
     * @return
     */
    public static Date addMonth(Date date, int i) {
        Calendar cl = Calendar.getInstance();
        cl.setTime(date);
        cl.add(Calendar.MONTH, i);
        return cl.getTime();
    }

    /**
     * 获取某个月的最后一天
     *
     * @param date
     * @return
     */
    public static Date getLastDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));
        return calendar.getTime();
    }


    public enum DateFormat {
        /**
         * 标准时间格式 - 【yyyy-MM-dd HH:mm:ss】
         */
        DATE_TIME("yyyy-MM-dd HH:mm:ss"),

        /**
         * 标准日期格式 - 【yyyy-MM-dd】
         */
        DATE("yyyy-MM-dd"),

        /**
         * 年月，带横线  -【yyyy-MM】
         */
        YEAR_MONTH("yyyy-MM"),

        /**
         * 年(后两位)月日，带横线  -【yy-MM-dd】
         */
        YEAR_HALF_MONTH_DAY("yy-MM-dd"),
        /**
         * 时间戳 -【yyyyMMddHHmmss】
         */
        YMDHMS("yyyyMMddHHmmss"),
        /**
         * 年月日-【yyyyMMdd】
         */
        YEARMONTHDAY("yyyyMMdd"),
        /**
         * 年月 - 【yyyyMM】
         */
        YEARMONTH("yyyyMM"),
        /**
         * 年月一共四位- 【yyMM】
         */
        YEARMONTH2("yyMM"),
        /**
         * 年 一共四位 【yyyy】
         */
        YEAR("yyyy"),

        /**
         * UTC 时间格式【yyyy-MM-dd'T'HH:mm:ss】
         */
        UTC_DATE("yyyy-MM-dd'T'HH:mm:ss"),

        ;

        DateFormat(String format) {
            this.format = format;
        }

        private String format;

        public String getFormat() {
            return format;
        }
    }

}

