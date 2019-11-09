package com.houpu.service.impl;

import com.houpu.dao.ProductDao;
import com.houpu.model.Product;
import com.houpu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired(required = false)
    private ProductDao productDao;

    @Override
    public List<Product> queryAll() {
        return productDao.queryAll();
    }

    @Override
    public void updateState(Integer id) {
        productDao.updateState(id);
    }

    @Override
    public void update(Product product) {
        productDao.update(product);
    }

    @Override
    public void saveProduct(Product product) {
        productDao.saveProduct(product);
    }
}
