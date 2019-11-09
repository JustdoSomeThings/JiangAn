package com.houpu.service;

import com.houpu.model.Inproduct;

import java.util.List;

public interface InproductService {
    /**
     * 查询所有Inproduct
     * @return
     */
    List<Inproduct> queryAll();
}
