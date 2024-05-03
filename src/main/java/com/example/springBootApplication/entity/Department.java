package com.example.springBootApplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;

    private String departmentAddress;

    private String departmentname;

    private String departmentcode;

    public long getId() {
        return id;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getDepartmentcode() {
        return departmentcode;
    }

    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Department(long id, String departmentAddress, String departmentname, String departmentcode) {
        this.id = id;
        this.departmentAddress = departmentAddress;
        this.departmentname = departmentname;
        this.departmentcode = departmentcode;
    }
    public Department()
    {

    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentAddress='" + departmentAddress + '\'' +
                ", departmentname='" + departmentname + '\'' +
                ", departmentcode='" + departmentcode + '\'' +
                '}';
    }
}
