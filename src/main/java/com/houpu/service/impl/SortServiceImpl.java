package com.houpu.service.impl;

import com.houpu.dao.SortDao;
import com.houpu.model.Sort;
import com.houpu.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SortServiceImpl implements SortService{

    @Autowired(required = false)
    private SortDao sortDao;

    @Override
    public List<Sort> queryAllSort() {
        List<Sort> sorts = sortDao.queryAllSort();
        return sorts;
    }

    @Override
    public int insertSort(Sort sort) {
        return sortDao.insertSort(sort);
    }
}
