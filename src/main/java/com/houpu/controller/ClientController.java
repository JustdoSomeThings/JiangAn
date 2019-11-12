package com.houpu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.houpu.model.Client;
import com.houpu.model.Employee;
import com.houpu.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping("/queryAllIs")
    public Map<String, Object> queryAllIs(int page, int limit, @RequestParam Integer is) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (!StringUtils.isEmpty(is)) {
            hashMap.put("is", is);
        }
        // 从第page页开始 每页查询limit数据
        PageHelper.startPage(page, limit);
        //调用实现类的方法执行业务
        List<Client> clients = clientService.queryAllClientIs(is);
        //创建一个存储页面信息的对象
        PageInfo<Client> pageInfo = new PageInfo<>(clients, limit);
        //创建hasMap将MySQL数据给页面
        HashMap<String, Object> result = new HashMap<>();
        result.put("code", 0);
        result.put("data", pageInfo.getList());//页面数据
        result.put("count", pageInfo.getTotal());//分页总数
        return result;
    }

}
