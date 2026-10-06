package com.service;

import com.dao.MyDao;
import com.mapper.TestMapper;
import com.utility.TestUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.LogManager;

@Service
public class MyServiceV2 {
    @Autowired
    private MyDao myDao;
    @Autowired
   private TestUtility testUtility;
    @Autowired
   private TestMapper testMapper;

    public void test() {
        myDao.test();
        testUtility.test();
        testMapper.test();

    }
}
