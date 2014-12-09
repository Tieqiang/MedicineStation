package com.medicine.models.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by heren on 2014/12/9.
 */
@Entity
@Table(name="config_info")
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class ConfigInfo {
    @Id
    @Column
    private String id ;

    @Column(name="package_name")
    private String packageName ;
    @Column(name="class_name")
    private String className ;
    @Column
    private String sql ;

    public ConfigInfo() {
    }

    public ConfigInfo(String id, String packageName, String className, String sql) {
        this.id = id;
        this.packageName = packageName;
        this.className = className;
        this.sql = sql;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConfigInfo)) return false;

        ConfigInfo that = (ConfigInfo) o;

        if (!className.equals(that.className)) return false;
        if (!id.equals(that.id)) return false;
        if (!packageName.equals(that.packageName)) return false;
        if (!sql.equals(that.sql)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + packageName.hashCode();
        result = 31 * result + className.hashCode();
        result = 31 * result + sql.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ConfigInfo{" +
                "id='" + id + '\'' +
                ", packageName='" + packageName + '\'' +
                ", className='" + className + '\'' +
                ", sql='" + sql + '\'' +
                '}';
    }
}
