package com.medicine.models.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by heren on 2014/10/13.
 */
@Entity
@Table(name="dept_dict")
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class DeptDict implements Serializable {

    @Id
    @Column(name = "DEPT_CODE", length = 20)
    @Size
    private String deptId;

    @Column(name = "SERIAL_NO", length = 4)
    @NotNull
    private Long serialNo;

    @Column(name = "DEPT_NAME", length = 20)
    @NotNull
    private String deptName;

    public DeptDict() {
    }

    public DeptDict(String deptId, Long serialNo, String deptName) {
        this.deptId = deptId;
        this.serialNo = serialNo;
        this.deptName = deptName;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public Long getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(Long serialNo) {
        this.serialNo = serialNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeptDict)) return false;

        DeptDict deptDict = (DeptDict) o;

        if (deptId != null ? !deptId.equals(deptDict.deptId) : deptDict.deptId != null) return false;
        if (deptName != null ? !deptName.equals(deptDict.deptName) : deptDict.deptName != null) return false;
        if (serialNo != null ? !serialNo.equals(deptDict.serialNo) : deptDict.serialNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deptId != null ? deptId.hashCode() : 0;
        result = 31 * result + (serialNo != null ? serialNo.hashCode() : 0);
        result = 31 * result + (deptName != null ? deptName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DeptDict{" +
                "deptId='" + deptId + '\'' +
                ", serialNo=" + serialNo +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
