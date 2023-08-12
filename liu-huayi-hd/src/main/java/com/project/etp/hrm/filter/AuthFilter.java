package com.project.etp.hrm.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.etp.hrm.exception.BusinessException;
import com.project.etp.hrm.exception.ExceptionStatusCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.stereotype.Component;


import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/***
 * @Author: it.wizard@foxmail.com
 * @Date: 2023/3/17 9:29
 * @Description: 所有的请求都先进来这里   后端的拦截器
 *
 * @Version 1.0
 ***/
@Component
public class AuthFilter extends BaseFilter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        String contentType = servletRequest.getContentType();
        logger.info("前端请求的contentType={}", contentType);
        String authorization = httpServletRequest.getHeader("Authorization");
        logger.info("请求头中的authorization===================={}", authorization);
        if (StringUtils.isEmpty(authorization) ||
                (!authorization.startsWith("bearer")
                        && !authorization.startsWith("Bearer"))) {
            returnResult(httpServletResponse, "", ExceptionStatusCode.ERROR_USER_TOKEN_MISSION);
            return;
        }
        authorization = StringUtils.removeIgnoreCase(authorization, "bearer ");
        HashMap<String, Object> hashMap = null;
        try {
            Jwt decode = JwtHelper.decode(authorization);
            String claims = decode.getClaims();
            hashMap = new ObjectMapper().readValue(claims, HashMap.class);
        } catch (Exception e) {
///          在filter 抛出的异常，不可被程序捕获
            e.printStackTrace();
            logger.error("解密token失败-,{},{},{}", e.getMessage(), e.getLocalizedMessage(), e.getStackTrace());
            returnResult(httpServletResponse, "解密失败....", ExceptionStatusCode.ERROR_USER_TOKEN_INVALID);
            return;
        }
        if (Objects.isNull(hashMap) || Objects.isNull(hashMap.get("userId"))) {
            returnResult(httpServletResponse, "", ExceptionStatusCode.ERROR_USER_TOKEN_INVALID);
            return;
        }
        httpServletRequest.setAttribute("userInfo", hashMap);
        filterChain.doFilter(httpServletRequest, httpServletResponse);

    }

    @Override
    public int getOrder() {
        return 1;
    }
}
