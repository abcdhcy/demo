package com.hcy.demo.service.impl;

import com.hcy.demo.dao.TestDao;
import com.hcy.demo.eneity.Test;
import com.hcy.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private TestDao testDao;

    @Override
    public List<Test> findAll() {
        return testDao.findAll();
    }
}
