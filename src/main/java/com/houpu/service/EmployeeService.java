package com.houpu.service;


import com.houpu.model.Employee;
import com.houpu.model.Part;

import java.util.List;

public interface EmployeeService {

    /**
     * 查询所有员工
     * @return
     */
    List<Employee> queryAllEmployee();

    /**
     * 根据查询所有员工的真实姓名
     * @return
     */
    List<String> queryTrueName(Part part);


    /**
     * 查询所有员工
     * @return
     */
    List<Employee> queryEmp();

}
