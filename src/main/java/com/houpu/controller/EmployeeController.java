package com.houpu.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.houpu.model.Employee;
import com.houpu.model.Part;
import com.houpu.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 查询所有状态为存在的员工
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping(value = "/queryAll", method = RequestMethod.GET)
    public Map<String, Object> queryAll(int page, int limit) {
        //从第page页开始 每页查询limit数据
        PageHelper.startPage(page, limit);
        //调用实现类的方法执行业务
        List<Employee> clientList = employeeService.queryAllEmployee();
        //创建一个存储页面信息的对象
        PageInfo<Employee> pageInfo = new PageInfo<>(clientList, limit);
        //创建hasMap将MySQL数据给页面
        HashMap<String, Object> result = new HashMap<>();
        result.put("code", 0);
        result.put("data", pageInfo.getList());//页面数据
        result.put("count", pageInfo.getTotal());//分页总数
        return result;
    }

    /**
     * 查询所有部门名称
     * @return
     */
    @RequestMapping(value = "/queryTrueName", method = RequestMethod.POST)
    public List<String> queryTrueName(@RequestBody Part part) {
        List<String> trueNameList = employeeService.queryTrueName(part);
        return trueNameList;
    }

    /**
     * 查询所有部门名称
     * @return
     */
    @RequestMapping(value = "/queryEmp", method = RequestMethod.GET)
    public Map<String, Object> queryEmp(int page, int limit) {
        //从第page页开始 每页查询limit数据
        PageHelper.startPage(page, limit);
        //调用实现类的方法执行业务
        List<Employee> clientList = employeeService.queryEmp();
        //创建一个存储页面信息的对象
        PageInfo<Employee> pageInfo = new PageInfo<>(clientList, limit);
        //创建hasMap将MySQL数据给页面
        HashMap<String, Object> result = new HashMap<>();
        result.put("code", 0);
        result.put("data", pageInfo.getList());//页面数据
        result.put("count", pageInfo.getTotal());//分页总数
        return result;
    }


}
