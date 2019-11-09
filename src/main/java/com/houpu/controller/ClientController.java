package com.houpu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.houpu.model.Client;
import com.houpu.model.Employee;
import com.houpu.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    /**
     * 查询所有状态为存在的客户
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping(value = "/queryAll", method = RequestMethod.GET)
    public Map<String, Object> queryAll(int page, int limit) {
        //从第page页开始 每页查询limit数据
        PageHelper.startPage(page, limit);
        List<Client> clientList = clientService.queryAll();
        PageInfo<Client> pageInfo = new PageInfo<>(clientList, limit);
        HashMap<String, Object> result = new HashMap<>();
        result.put("code", 0);
        result.put("data", pageInfo.getList());
        result.put("count", pageInfo.getTotal());
        return result;
    }

    /**
     * 根据员工查询所有客户姓名
     * @return
     */
    @RequestMapping(value = "/queryName", method = RequestMethod.POST)
    public List<String> queryName(@RequestBody Employee employee) {
        List<String> trueNameList = clientService.queryName(employee);
        return trueNameList;
    }

    /**
     * 删除一个客户(可恢复)
     * @param partId
     */
    @RequestMapping(value = "/updateState", method = RequestMethod.POST)
    public void updateState(Integer partId) {
        clientService.updateState(partId);
    }

    /**
     * 更新一个客户
     * @param client
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void update(Client client) {
        clientService.update(client);
    }

    /**
     * 新增一个客户
     * @param client
     */
    @RequestMapping(value = "/saveClient", method = RequestMethod.POST)
    public void saveClient(Client client) {
        clientService.saveClient(client);
    }
}
