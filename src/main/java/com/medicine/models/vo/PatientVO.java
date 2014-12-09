package com.medicine.models.vo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by heren on 2014/12/9.
 */
@XmlRootElement
public class PatientVO {

    private String patientId ;
    private String name ;
    private Integer visitId ;
    private String inpNo ;
    private String sex ;
    private String idNo ;
    private String identity ;

    public PatientVO(String patientId, String name, Integer visitId, String inpNo, String sex, String idNo, String identity) {
        this.patientId = patientId;
        this.name = name;
        this.visitId = visitId;
        this.inpNo = inpNo;
        this.sex = sex;
        this.idNo = idNo;
        this.identity = identity;
    }

    public PatientVO() {
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVisitId() {
        return visitId;
    }

    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
    }

    public String getInpNo() {
        return inpNo;
    }

    public void setInpNo(String inpNo) {
        this.inpNo = inpNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PatientVO)) return false;

        PatientVO patientVO = (PatientVO) o;

        if (!idNo.equals(patientVO.idNo)) return false;
        if (!identity.equals(patientVO.identity)) return false;
        if (!inpNo.equals(patientVO.inpNo)) return false;
        if (!name.equals(patientVO.name)) return false;
        if (!patientId.equals(patientVO.patientId)) return false;
        if (!sex.equals(patientVO.sex)) return false;
        if (!visitId.equals(patientVO.visitId)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = patientId.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + visitId.hashCode();
        result = 31 * result + inpNo.hashCode();
        result = 31 * result + sex.hashCode();
        result = 31 * result + idNo.hashCode();
        result = 31 * result + identity.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "PatientVO{" +
                "patientId='" + patientId + '\'' +
                ", name='" + name + '\'' +
                ", visitId=" + visitId +
                ", inpNo='" + inpNo + '\'' +
                ", sex='" + sex + '\'' +
                ", idNo='" + idNo + '\'' +
                ", identity='" + identity + '\'' +
                '}';
    }
}
