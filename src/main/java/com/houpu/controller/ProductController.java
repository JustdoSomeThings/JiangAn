package com.houpu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.houpu.model.Product;
import com.houpu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * 查询所有状态为存在的产品
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping(value = "/queryAll", method = RequestMethod.GET)
    public Map<String, Object> queryAll(int page, int limit) {
        // 从第page页开始 每页查询limit数据
        PageHelper.startPage(page, limit);

        List<Product> clientList = productService.queryAll();
        PageInfo<Product> pageInfo = new PageInfo<>(clientList, limit);

        HashMap<String, Object> result = new HashMap<>();
        result.put("code", 0);
        result.put("data", pageInfo.getList());
        result.put("count", pageInfo.getTotal());

        return result;
    }

    /**
     * 删除一个产品(可恢复)
     * @param partId
     */
    @RequestMapping(value = "/updateState", method = RequestMethod.POST)
    public void updateState(Integer partId) {
        productService.updateState(partId);
    }

    /**
     * 更新一个产品
     * @param product
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void update(Product product) {
        productService.update(product);
    }

    /**
     * 新增一个产品
     * @param product
     */
    @RequestMapping(value = "/saveClient", method = RequestMethod.POST)
    public void saveProduct(Product product) {
        productService.saveProduct(product);
    }
}
