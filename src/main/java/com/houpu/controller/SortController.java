package com.houpu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.houpu.model.Sort;
import com.houpu.service.SortService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sort")
public class SortController {
    @Autowired
    private SortService sortService;

    /**
     * 查询所有类别
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping(value = "/queryAll" ,method= RequestMethod.GET)
    public Map<String, Object> queryAll(int page, int limit){
        // 从第page页开始 每页查询limit数据
        PageHelper.startPage(page, limit);
        //调用实现类的方法执行业务
        List<Sort> sorts = sortService.queryAllSort();
        //创建一个存储页面信息的对象
        PageInfo<Sort> pageInfo = new PageInfo<>(sorts, limit);
        //创建hasMap将MySQL数据给页面
        HashMap<String, Object> result = new HashMap<>();
        result.put("code", 0);
        result.put("data", pageInfo.getList());//页面数据
        result.put("count", pageInfo.getTotal());//分页总数
        return result;
    }


    @RequestMapping(value="/insert", method = RequestMethod.POST)
    public Map<String,Object> insertSort(@RequestBody Sort sort){
        int i = sortService.insertSort(sort);
        HashMap<String, Object> result = new HashMap<>();
        result.put("is", "0");
        result.put("msg", "新增成功");
        return  result;
    }

    @GetMapping("/queryAllIs")
    public Map<String, Object> queryAllIs(int page, int limit, @RequestParam Integer is){
        HashMap<String, Object> hashMap = new HashMap<>();
        if (!StringUtils.isEmpty(is)){
            hashMap.put("is", is);
        }

        // 从第page页开始 每页查询limit数据
        PageHelper.startPage(page, limit);
        //调用实现类的方法执行业务
        List<Sort> sorts = sortService.queryAllSortIs(is);
        //创建一个存储页面信息的对象
        PageInfo<Sort> pageInfo = new PageInfo<>(sorts, limit);
        //创建hasMap将MySQL数据给页面
        HashMap<String, Object> result = new HashMap<>();
        result.put("code", 0);
        result.put("data", pageInfo.getList());//页面数据
        result.put("count", pageInfo.getTotal());//分页总数
        return result;
    }
    /**
     * 删除一个部门(可恢复)
     * @param
     */
    @RequestMapping(value = "/updateIs", method = RequestMethod.POST)
    public Map<String, Object> updateIs(@RequestBody Sort sort) {
        System.out.println(sort);
        sortService.updateIs(sort);
        HashMap<String, Object> result = new HashMap<>();
        result.put("status", "1");
        result.put("msg", "执行成功");
        return result;
    }


}
