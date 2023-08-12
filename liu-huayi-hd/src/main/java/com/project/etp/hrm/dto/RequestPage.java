package com.project.etp.hrm.dto;

/***
 * @Author: it.wizard@foxmail.com
 * @Date: 2023/3/17 15:41
 * @Description: TODO
 * @Version 1.0
 ***/
public class RequestPage {

    private Long pageNum;
    private Long pageSize;
    private String sortFiled;
    private String sort;

    public RequestPage() {
    }

    @Override
    public String toString() {
        return "RequestPage{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", sortFiled='" + sortFiled + '\'' +
                ", sort='" + sort + '\'' +
                '}';
    }

    public Long getPageNum() {
        return pageNum;
    }

    public void setPageNum(Long pageNum) {
        this.pageNum = pageNum;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public String getSortFiled() {
        return sortFiled;
    }

    public void setSortFiled(String sortFiled) {
        this.sortFiled = sortFiled;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
