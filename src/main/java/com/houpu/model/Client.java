package com.houpu.model;

import lombok.Data;

/**
 * 客户
 */
@Data
public class Client {

    private Integer id;
    private Integer employeeId;
    private String name;
    private String tel;
    private String address;
    private Integer is;

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", is=" + is +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getIs() {
        return is;
    }

    public void setIs(Integer is) {
        this.is = is;
    }
}
