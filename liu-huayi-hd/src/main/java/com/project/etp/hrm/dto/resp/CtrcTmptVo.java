package com.project.etp.hrm.dto.resp;

import com.project.etp.hrm.entity.ContractTemplate;
import com.project.etp.hrm.util.DateUtil;

import java.util.Date;
import java.util.List;

/***
 * @Author: it.wizard@foxmail.com
 * @Date: 2023/3/17 15:29
 * @Description: TODO
 * @Version 1.0
 ***/
public class CtrcTmptVo {

    private String ctrcTmptNo;
    private String ctrcTmptType;
    private String validDateBegin;
    private String validDateEnd;
    private String adtStatus;
    private String adtStatusName;
    private String remark;
    private String ctrcTmptFileId;
    private String ctrcTmptFileName;
    private String creator;
    private String createDate;
    private String deptId;

    public static CtrcTmptVo inject(ContractTemplate contractTemplate) {
        if (contractTemplate == null) {
            return null;
        }
        CtrcTmptVo ctrcTmptVo = new CtrcTmptVo();
        ctrcTmptVo.setCtrcTmptNo(contractTemplate.getCtrcTmptNo());
        ctrcTmptVo.setCtrcTmptType(contractTemplate.getCtrcTmptType());
        ctrcTmptVo.setValidDateBegin(contractTemplate.getValidDateBegin());
        ctrcTmptVo.setValidDateEnd(contractTemplate.getValidDateEnd());
        ctrcTmptVo.setAdtStatus(contractTemplate.getAdtStatus());
        ctrcTmptVo.setRemark(contractTemplate.getRemark());
        ctrcTmptVo.setCtrcTmptFileId(contractTemplate.getCtrcTmptFileId());
        ctrcTmptVo.setCtrcTmptFileName(contractTemplate.getCtrcTmptFileName());
        ctrcTmptVo.setCreator(contractTemplate.getCreator());
        ctrcTmptVo.setCreateDate(DateUtil.format(contractTemplate.getCreateDate(), DateUtil.DateFormat.DATE));
        ctrcTmptVo.setDeptId(contractTemplate.getDeptId());
        return ctrcTmptVo;
    }


    public CtrcTmptVo() {
    }

    @Override
    public String toString() {
        return "CtrcTmptVo{" +
                "ctrcTmptNo='" + ctrcTmptNo + '\'' +
                ", ctrcTmptType='" + ctrcTmptType + '\'' +
                ", validDateBegin='" + validDateBegin + '\'' +
                ", validDateEnd='" + validDateEnd + '\'' +
                ", adtStatus='" + adtStatus + '\'' +
                ", adtStatusName='" + adtStatusName + '\'' +
                ", remark='" + remark + '\'' +
                ", ctrcTmptFileId='" + ctrcTmptFileId + '\'' +
                ", ctrcTmptFileName='" + ctrcTmptFileName + '\'' +
                ", creator='" + creator + '\'' +
                ", createDate=" + createDate +
                ", deptId='" + deptId + '\'' +
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

    public String getAdtStatusName() {
        return adtStatusName;
    }

    public void setAdtStatusName(String adtStatusName) {
        this.adtStatusName = adtStatusName;
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

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }
}
