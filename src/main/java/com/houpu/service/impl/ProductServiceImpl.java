package com.houpu.service.impl;

import com.houpu.dao.ProductDao;
import com.houpu.model.Product;
import com.houpu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired(required = false)
    private ProductDao productDao;


    @Override
    public List<Product> queryAllProduct() {
        return productDao.queryAllProduct();
    }
}
