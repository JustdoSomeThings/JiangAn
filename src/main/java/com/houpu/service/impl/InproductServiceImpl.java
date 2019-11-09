package com.houpu.service.impl;

import com.houpu.dao.InproductDao;
import com.houpu.model.Inproduct;
import com.houpu.service.InproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InproductServiceImpl implements InproductService {

    @Autowired(required = false)
    private InproductDao inproductDao;

    @Override
    public List<Inproduct> queryAll() {
        return inproductDao.queryAll();
    }

}
