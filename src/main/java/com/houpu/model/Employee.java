package com.houpu.model;

import lombok.Data;

/**
 * 员工
 */
@Data
public class Employee {

    private Integer id;
    private Integer partId;
    private String loginName;
    private String password;
    private String img;
    private String gender;
    private Integer flag;
    private Integer admin;
    private String remark;
    private String trueName;
    private Integer is;
    private Part part;

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", partId=" + partId +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", img='" + img + '\'' +
                ", gender='" + gender + '\'' +
                ", flag=" + flag +
                ", admin=" + admin +
                ", remark='" + remark + '\'' +
                ", trueName='" + trueName + '\'' +
                ", is=" + is +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getAdmin() {
        return admin;
    }

    public void setAdmin(Integer admin) {
        this.admin = admin;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public Integer getIs() {
        return is;
    }

    public void setIs(Integer is) {
        this.is = is;
    }
}
