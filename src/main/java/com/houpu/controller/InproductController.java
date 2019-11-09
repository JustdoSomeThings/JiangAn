package com.houpu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.houpu.model.Inproduct;
import com.houpu.service.InproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/inproduct")
public class InproductController {

    @Autowired
    private InproductService inproductService;

    /**
     * 出入库管理
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping(value = "/queryAll", method = RequestMethod.GET)
    public Map<String, Object> queryAll(int page, int limit) {
        // 从第page页开始 每页查询limit数据
        PageHelper.startPage(page, limit);
        List<Inproduct> clientList = inproductService.queryAll();
        PageInfo<Inproduct> pageInfo = new PageInfo<>(clientList, limit);
        HashMap<String, Object> result = new HashMap<>();
        result.put("code", 0);
        result.put("data", pageInfo.getList());
        result.put("count", pageInfo.getTotal());
        return result;
    }

}
