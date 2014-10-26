package com.medicine.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by heren on 2014/10/26.
 */
@Entity
@Table(name="staff_dict")
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class StaffDict implements java.io.Serializable {


    private String empNo;
    private String deptCode;
    private String name;
    private String inputCode;
    private String job;
    private String title;
    private String userName;

    // Constructors

    /** default constructor */
    public StaffDict() {
    }

    /** minimal constructor */
    public StaffDict(String empNo) {
        this.empNo = empNo;
    }

    /** full constructor */
    public StaffDict(String empNo, String deptCode, String name,
                     String inputCode, String job, String title, String userName) {
        this.empNo = empNo;
        this.deptCode = deptCode;
        this.name = name;
        this.inputCode = inputCode;
        this.job = job;
        this.title = title;
        this.userName = userName;
    }

    // Property accessors
    @Id
    @Column(name = "EMP_NO", unique = true, nullable = false, length = 6)
    public String getEmpNo() {
        return this.empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    @Column(name = "DEPT_CODE", length = 8)
    public String getDeptCode() {
        return this.deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    @Column(name = "NAME", length = 8)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "INPUT_CODE", length = 8)
    public String getInputCode() {
        return this.inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode;
    }

    @Column(name = "JOB", length = 8)
    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Column(name = "TITLE", length = 10)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "USER_NAME", length = 16)
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StaffDict)) return false;

        StaffDict staffDict = (StaffDict) o;

        if (!deptCode.equals(staffDict.deptCode)) return false;
        if (!empNo.equals(staffDict.empNo)) return false;
        if (!inputCode.equals(staffDict.inputCode)) return false;
        if (!job.equals(staffDict.job)) return false;
        if (!name.equals(staffDict.name)) return false;
        if (!title.equals(staffDict.title)) return false;
        if (!userName.equals(staffDict.userName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empNo.hashCode();
        result = 31 * result + deptCode.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + inputCode.hashCode();
        result = 31 * result + job.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + userName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "StaffDict{" +
                "empNo='\" + empNo + '\\'' +\n" +
                "                \", deptCode='" + deptCode + '\'' +
                ", name='" + name + '\'' +
                ", inputCode='" + inputCode + '\'' +
                ", job='" + job + '\'' +
                ", title='" + title + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}