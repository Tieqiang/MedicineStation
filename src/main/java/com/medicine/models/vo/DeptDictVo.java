package com.medicine.models.vo;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by heren on 2014/12/8.
 */
@XmlRootElement
public class DeptDictVo implements Serializable{

    private Integer serialNo;
    private String deptCode;
    private String deptName;
    private String deptAlias;
    private Integer clinicAttr;
    private Integer outpOrInp;
    private Integer internalOrSergery;
    private String inputCode;
    private String insurDeptCode;
    private String reckonUnitOutp;
    private String reckonUnitInp;
    private Boolean deptAttr;

    public DeptDictVo() {
    }

    public DeptDictVo(Integer serialNo, String deptCode, String deptName, String deptAlias, Integer clinicAttr, Integer outpOrInp, Integer internalOrSergery, String inputCode, String insurDeptCode, String reckonUnitOutp, String reckonUnitInp, Boolean deptAttr) {
        this.serialNo = serialNo;
        this.deptCode = deptCode;
        this.deptName = deptName;
        this.deptAlias = deptAlias;
        this.clinicAttr = clinicAttr;
        this.outpOrInp = outpOrInp;
        this.internalOrSergery = internalOrSergery;
        this.inputCode = inputCode;
        this.insurDeptCode = insurDeptCode;
        this.reckonUnitOutp = reckonUnitOutp;
        this.reckonUnitInp = reckonUnitInp;
        this.deptAttr = deptAttr;
    }

    public Integer getSerialNo() {
        return serialNo;
    }

    public void setSerial_No(Integer serial_no){
        this.serialNo = serial_no ;
    }
    public void setSerialNo(Integer serialNo) {
        this.serialNo = serialNo;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptAlias() {
        return deptAlias;
    }

    public void setDeptAlias(String deptAlias) {
        this.deptAlias = deptAlias;
    }

    public Integer getClinicAttr() {
        return clinicAttr;
    }

    public void setClinicAttr(Integer clinicAttr) {
        this.clinicAttr = clinicAttr;
    }

    public Integer getOutpOrInp() {
        return outpOrInp;
    }

    public void setOutpOrInp(Integer outpOrInp) {
        this.outpOrInp = outpOrInp;
    }

    public Integer getInternalOrSergery() {
        return internalOrSergery;
    }

    public void setInternalOrSergery(Integer internalOrSergery) {
        this.internalOrSergery = internalOrSergery;
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode;
    }

    public String getInsurDeptCode() {
        return insurDeptCode;
    }

    public void setInsurDeptCode(String insurDeptCode) {
        this.insurDeptCode = insurDeptCode;
    }

    public String getReckonUnitOutp() {
        return reckonUnitOutp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeptDictVo)) return false;

        DeptDictVo that = (DeptDictVo) o;

        if (!clinicAttr.equals(that.clinicAttr)) return false;
        if (!deptAlias.equals(that.deptAlias)) return false;
        if (!deptAttr.equals(that.deptAttr)) return false;
        if (!deptCode.equals(that.deptCode)) return false;
        if (!deptName.equals(that.deptName)) return false;
        if (!inputCode.equals(that.inputCode)) return false;
        if (!insurDeptCode.equals(that.insurDeptCode)) return false;
        if (!internalOrSergery.equals(that.internalOrSergery)) return false;
        if (!outpOrInp.equals(that.outpOrInp)) return false;
        if (!reckonUnitInp.equals(that.reckonUnitInp)) return false;
        if (!reckonUnitOutp.equals(that.reckonUnitOutp)) return false;
        if (!serialNo.equals(that.serialNo)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = serialNo.hashCode();
        result = 31 * result + deptCode.hashCode();
        result = 31 * result + deptName.hashCode();
        result = 31 * result + deptAlias.hashCode();
        result = 31 * result + clinicAttr.hashCode();
        result = 31 * result + outpOrInp.hashCode();
        result = 31 * result + internalOrSergery.hashCode();
        result = 31 * result + inputCode.hashCode();
        result = 31 * result + insurDeptCode.hashCode();
        result = 31 * result + reckonUnitOutp.hashCode();
        result = 31 * result + reckonUnitInp.hashCode();
        result = 31 * result + deptAttr.hashCode();
        return result;
    }

    public void setReckonUnitOutp(String reckonUnitOutp) {
        this.reckonUnitOutp = reckonUnitOutp;
    }

    public String getReckonUnitInp() {
        return reckonUnitInp;
    }

    public void setReckonUnitInp(String reckonUnitInp) {
        this.reckonUnitInp = reckonUnitInp;
    }

    public Boolean getDeptAttr() {
        return deptAttr;
    }

    public void setDeptAttr(Boolean deptAttr) {
        this.deptAttr = deptAttr;
    }

    @Override
    public String toString() {
        return "DeptDictVo{" +
                "serialNo=" + serialNo +
                ", deptCode='" + deptCode + '\'' +
                ", deptName='" + deptName + '\'' +
                ", deptAlias='" + deptAlias + '\'' +
                ", clinicAttr=" + clinicAttr +
                ", outpOrInp=" + outpOrInp +
                ", internalOrSergery=" + internalOrSergery +
                ", inputCode='" + inputCode + '\'' +
                ", insurDeptCode='" + insurDeptCode + '\'' +
                ", reckonUnitOutp='" + reckonUnitOutp + '\'' +
                ", reckonUnitInp='" + reckonUnitInp + '\'' +
                ", deptAttr=" + deptAttr +
                '}';
    }
}
