package com.project.etp.hrm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/***
 * @Author: it.wizard@foxmail.com
 * @Date: 2023/3/17 15:22
 * @Description: TODO
 * @Version 1.0
 ***/
@TableName("contract_template")
public class ContractTemplate {
    @TableId
    private String ctrcTmptNo;
    private String ctrcTmptType;
    private String validDateBegin;
    private String validDateEnd;
    private String adtStatus;
    private String remark;
    private String ctrcTmptFileId;
    private String ctrcTmptFileName;
    private String creator;
    private Date createDate;
    private String deptId;
    private String lastModifier;
    private Date lastModifyDate;

    public ContractTemplate() {
    }

    @Override
    public String toString() {
        return "ContractTemplate{" +
                "ctrcTmptNo='" + ctrcTmptNo + '\'' +
                ", ctrcTmptType='" + ctrcTmptType + '\'' +
                ", validDateBegin='" + validDateBegin + '\'' +
                ", validDateEnd='" + validDateEnd + '\'' +
                ", adtStatus='" + adtStatus + '\'' +
                ", remark='" + remark + '\'' +
                ", ctrcTmptFileId='" + ctrcTmptFileId + '\'' +
                ", ctrcTmptFileName='" + ctrcTmptFileName + '\'' +
                ", creator='" + creator + '\'' +
                ", createDate=" + createDate +
                ", deptId='" + deptId + '\'' +
                ", lastModifier='" + lastModifier + '\'' +
                ", lastModifyDate=" + lastModifyDate +
                '}';
    }

    public String getCtrcTmptNo() {
        return ctrcTmptNo;
    }

    public void setCtrcTmptNo(String ctrcTmptNo) {
        this.ctrcTmptNo = ctrcTmptNo;
    }

    public String getCtrcTmptType() {
        return ctrcTmptType;
    }

    public void setCtrcTmptType(String ctrcTmptType) {
        this.ctrcTmptType = ctrcTmptType;
    }

    public String getValidDateBegin() {
        return validDateBegin;
    }

    public void setValidDateBegin(String validDateBegin) {
        this.validDateBegin = validDateBegin;
    }

    public String getValidDateEnd() {
        return validDateEnd;
    }

    public void setValidDateEnd(String validDateEnd) {
        this.validDateEnd = validDateEnd;
    }

    public String getAdtStatus() {
        return adtStatus;
    }

    public void setAdtStatus(String adtStatus) {
        this.adtStatus = adtStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCtrcTmptFileId() {
        return ctrcTmptFileId;
    }

    public void setCtrcTmptFileId(String ctrcTmptFileId) {
        this.ctrcTmptFileId = ctrcTmptFileId;
    }

    public String getCtrcTmptFileName() {
        return ctrcTmptFileName;
    }

    public void setCtrcTmptFileName(String ctrcTmptFileName) {
        this.ctrcTmptFileName = ctrcTmptFileName;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getLastModifier() {
        return lastModifier;
    }

    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
}
