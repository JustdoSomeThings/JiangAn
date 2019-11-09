package com.houpu.service.impl;

import com.houpu.dao.PartDao;
import com.houpu.model.Part;
import com.houpu.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartServiceImpl implements PartService {

    @Autowired(required = false)
    private PartDao partDao;

    @Override
    public List<String> queryName() {
        return partDao.queryName();
    }

    @Override
    public List<Part> queryLike(Part part) {
        return partDao.queryLike(part);
    }

    @Override
    public void updateState(Part part) {
        partDao.updateState(part);
    }

    @Override
    public void update(Part part) {
        partDao.update(part);
    }

    @Override
    public void savePart(Part part) {
        partDao.savePart(part);
    }
}
