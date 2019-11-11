package com.houpu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.StringUtil;
import com.houpu.model.Part;
import com.houpu.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.misc.Request;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/part")
public class PartController {

    @Autowired
    private PartService partService;

    /**
     * 查询所有部门名称
     * @return
     */
    @RequestMapping(value = "/queryName", method = RequestMethod.POST)
    public List<String> queryName() {
        List<String> nameList = partService.queryName();
        return nameList;
    }

    /**
     * 根据部门名称和备注模糊查询状态为存在的部门
     * @param page
     * @param limit
     * @param name
     * @param remark
     * @return
     */
    @RequestMapping(value = "/queryLike", method = RequestMethod.GET)
    public Map<String, Object> queryLike(int page, int limit, String name, String remark) {
        // 从第page页开始 每页查询limit数据
        PageHelper.startPage(page, limit);
        Part part = new Part();
        if(!StringUtil.isEmpty(name)){
            part.setName(name);
        }
        if (!StringUtil.isEmpty(remark)) {
            part.setRemark(remark);
        }
        List<Part> partList = partService.queryLike(part);
        PageInfo<Part> pageInfo = new PageInfo<>(partList, limit);
        HashMap<String, Object> result = new HashMap<>();
        result.put("code", 0);
        result.put("data", pageInfo.getList());
        result.put("count", pageInfo.getTotal());
        return result;
    }




    /**
     * 删除一个部门(可恢复)
     * @param part
     */
    @RequestMapping(value = "/updateState", method = RequestMethod.POST)
    public Map<String, Object> updateState(@RequestBody Part part) {
        partService.updateState(part);
        HashMap<String, Object> result = new HashMap<>();
        result.put("status", "1");
        result.put("msg", "执行成功");
        return result;
    }

    /**
     * 更新一个部门
     * @param part
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Map<String, Object> update(@RequestBody Part part) {
        partService.update(part);
        System.out.println(part);
        HashMap<String, Object> result = new HashMap<>();
        result.put("status", "1");
        result.put("msg", "执行成功");
        return result;
    }

    /**
     * 新增一个部门
     * @param part
     */
    @RequestMapping(value = "/savePart", method = RequestMethod.POST)
    public Map<String, Object> savePart(@RequestBody Part part) {
        partService.savePart(part);
        HashMap<String, Object> result = new HashMap<>();
        result.put("status", "1");
        result.put("msg", "执行成功");
        return result;
    }
}
