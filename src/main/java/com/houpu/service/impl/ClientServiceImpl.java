package com.houpu.service.impl;

import com.houpu.dao.ClientDao;
import com.houpu.model.Client;
import com.houpu.model.Employee;
import com.houpu.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired(required = false)
    private ClientDao clientDao;

    @Override
    public List<Client> queryAll() {
        return clientDao.queryAll();
    }

    @Override
    public List<String> queryName(Employee employee) {
        return clientDao.queryName(employee);
    }

    @Override
    public void updateState(Integer id) {
        clientDao.updateState(id);
    }

    @Override
    public void update(Client client) {
        clientDao.update(client);
    }

    @Override
    public void saveClient(Client client) {
        clientDao.saveClient(client);
    }
}
