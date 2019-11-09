package com.houpu.service;

import com.houpu.model.Part;

import java.util.List;

public interface PartService {

    /**
     * 查询所有部门名称
     * @return
     */
    List<String> queryName();

    /**
     * 根据部门名称和备注模糊查询
     * @param part
     * @return
     */
    List<Part> queryLike(Part part);

    /**
     * 删除一个部门(可恢复)
     * @param part
     */
    void updateState(Part part);

    /**
     * 更新一个部门信息
     * @param part
     */
    void update(Part part);

    /**
     * 新增一个部门
     * @param part
     */
    void savePart(Part part);
}
