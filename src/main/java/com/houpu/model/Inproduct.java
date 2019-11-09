package com.houpu.model;

import lombok.Data;
/**
 * Inproduct
 */
@Data
public class Inproduct {
    private Integer id;
    private String remark;
    private Integer count;
    private String time;

    private Product product;
    private Sort sort;

    @Override
    public String toString() {
        return "Inproduct{" +
                "id=" + id +
                ", remark='" + remark + '\'' +
                ", count=" + count +
                ", time='" + time + '\'' +
                ", product=" + product +
                ", sort=" + sort +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }
}
