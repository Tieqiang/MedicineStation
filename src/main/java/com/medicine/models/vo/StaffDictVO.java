package com.medicine.models.vo;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by heren on 2014/10/26.
 */
@XmlRootElement
public class StaffDictVO implements Serializable {
    private String emp ;
    private String name ;

    public StaffDictVO() {
    }

    public StaffDictVO(String emp, String name) {
        this.emp = emp;
        this.name = name;
    }

    public String getEmp() {
        return emp;
    }

    public void setEmp(String emp) {
        this.emp = emp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StaffDictVO)) return false;

        StaffDictVO that = (StaffDictVO) o;

        if (emp != null ? !emp.equals(that.emp) : that.emp != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = emp != null ? emp.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StaffDictVO{" +
                "emp='" + emp + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
