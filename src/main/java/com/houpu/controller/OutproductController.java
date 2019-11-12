package com.houpu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.houpu.model.Outproduct;
import com.houpu.service.OutproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/outproduct")
public class OutproductController {
    @Autowired
    private OutproductService outproductService;

    @RequestMapping(value = "/showAll", method = RequestMethod.GET)
    public Map<String, Object> queryAll(int page, int limit) {
        // 从第page页开始 每页查询limit数据
        PageHelper.startPage(page, limit);
        List<Outproduct> clientList = outproductService.showAll();
        PageInfo<Outproduct> pageInfo = new PageInfo<>(clientList, limit);
        HashMap<String, Object> result = new HashMap<>();
        result.put("code", 0);
        result.put("data", pageInfo.getList());
        result.put("count", pageInfo.getTotal());
        return result;
    }

}
