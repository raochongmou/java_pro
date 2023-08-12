package com.project.etp.hrm.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/***
 * @Author: it.wizard@foxmail.com
 * @Date: 2023/3/17 15:02
 * @Description: TODO
 * @Version 1.0
 ***/
@PropertySource("classpath:application.properties")
@Configuration
@MapperScan("com.project.etp.hrm.mapper")
public class MybatisPlusConfig {

    @Value("${mybatis.plus.config.dbType}")
    private String dbType;


    /**
     * 最新版的
     *
     * @return
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.getDbType(dbType.trim())));
        return interceptor;
    }
}
