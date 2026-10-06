package com.service;

import com.dao.MyDao;
import org.springframework.stereotype.Service;


@Service
public class MyService {
    private final MyDao myDao;


    public MyService(MyDao myDao) {
        this.myDao = myDao;
    }
    public void test()
    {
        myDao.test();
    }
}
