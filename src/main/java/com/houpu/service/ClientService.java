package com.houpu.service;


import com.houpu.model.Client;
import com.houpu.model.Employee;

import java.util.List;

public interface ClientService {

    /**
     * 查询所有客户
     * @return
     */
    List<Client> queryAll();

    /**
     * 根据员工查询所有客户姓名
     * @param employee
     * @return
     */
    List<String> queryName(Employee employee);

    /**
     * 删除一个客户(更新客户状态, 可恢复)
     * @param id
     */
    void updateState(Integer id);

    /**
     * 更新一个客户信息
     * @param client
     */
    void update(Client client);

    /**
     * 新增一个客户
     * @param client
     */
    void saveClient(Client client);
}
