package com.houpu.model;

import lombok.Data;

/**
 * 部门
 */
@Data
public class Part {

    private Integer id;
    private String name;
    private String remark;
    private Integer is;

    @Override
    public String toString() {
        return "Part{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                ", is=" + is +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIs() {
        return is;
    }

    public void setIs(Integer is) {
        this.is = is;
    }
}
