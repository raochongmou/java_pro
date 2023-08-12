package com.project.etp.hrm.dto;

import java.util.Map;

/***
 * @Author: it.wizard@foxmail.com
 * @Date: 2023/3/17 15:40
 * @Description: TODO
 * @Version 1.0
 ***/
public class RequestDto {

    private RequestPage page;
    private Map<String, Object> condition;
    private String userId;

    public RequestDto() {

    }

    @Override
    public String toString() {
        return "RequestDto{" +
                "page=" + page +
                ", condition=" + condition +
                ", userId='" + userId + '\'' +
                '}';
    }

    public RequestPage getPage() {
        return page;
    }

    public void setPage(RequestPage page) {
        this.page = page;
    }

    public Map<String, Object> getCondition() {
        return condition;
    }

    public void setCondition(Map<String, Object> condition) {
        this.condition = condition;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
