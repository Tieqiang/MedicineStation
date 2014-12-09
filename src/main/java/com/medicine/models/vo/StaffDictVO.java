package com.medicine.models.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by heren on 2014/10/26.
 */
@XmlRootElement
public class StaffDictVO implements Serializable {

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    private String empNo ;
    private String name ;

    public StaffDictVO() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StaffDictVO(String emp, String name) {
        this.empNo = emp;
        this.name = name;
    }
}
