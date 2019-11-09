package com.houpu.model;

import lombok.Data;

/**
 * 产品
 */
@Data
public class Product {

    private Integer id;
    private Integer sortId;
    private String name;
    private String area;
    private String ml;
    private Integer is;
    private Sort sort;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", sortId=" + sortId +
                ", name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", ml='" + ml + '\'' +
                ", is=" + is +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getMl() {
        return ml;
    }

    public void setMl(String ml) {
        this.ml = ml;
    }

    public Integer getIs() {
        return is;
    }

    public void setIs(Integer is) {
        this.is = is;
    }
}
