package com.houpu.service.impl;


import com.houpu.dao.OutproductDao;
import com.houpu.model.Outproduct;
import com.houpu.service.OutproductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OutproductServiceImpl implements OutproductService {
    @Autowired(required = false)
    private OutproductDao outproductdao;


    @Override
    public List<Outproduct> showAll() {
        return outproductdao.showAll();
    }
}
