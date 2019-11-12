package com.houpu.service.impl;

import com.houpu.dao.SortDao;
import com.houpu.model.Sort;
import com.houpu.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

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

    @Override
    public List<Sort> queryAllSortIs( Integer is) {
        return sortDao.queryAllSortIs(is);
    }

    @Override
    public void updateIs(Sort sort) {
         sortDao.updateIs(sort);
    }
}
