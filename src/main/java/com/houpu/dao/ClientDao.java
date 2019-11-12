package com.houpu.dao;


import com.houpu.model.Client;
import com.houpu.model.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClientDao {

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
     * @param client
     */
    void updateState(Client client);

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

    /**
     * 查询删除的客户
     * @return
     */
    List<Client> queryAllClientIs(@Param("is") Integer is);
}
