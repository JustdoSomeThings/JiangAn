package com.houpu.service.impl;

import com.houpu.dao.EmployeeDao;
import com.houpu.model.Employee;
import com.houpu.model.Part;
import com.houpu.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired(required = false)
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> queryAllEmployee() {
        return employeeDao.queryAllEmployee();
    }

    @Override
    public List<String> queryTrueName(Part part) {
        return employeeDao.queryTrueName(part);
    }

    @Override
    public List<Employee> queryEmp() {
        return employeeDao.queryEmp();
    }

}
