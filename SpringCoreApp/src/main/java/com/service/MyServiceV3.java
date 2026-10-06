package com.service;

import com.dao.MyDao;
import com.mapper.TestMapper;
import com.utility.TestUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceV3 {

    private MyDao myDao;
    private TestUtility testUtility;
    private TestMapper testMapper;

    @Autowired
    public void setTestMapper(TestMapper testMapper) {
        this.testMapper = testMapper;
    }
    @Autowired
    public void setTestUtility(TestUtility testUtility) {
        this.testUtility = testUtility;
    }
    @Autowired
    public void setMyDao(MyDao myDao) {
        this.myDao = myDao;
    }

    public void test() {
        myDao.test();
        testUtility.test();
        testMapper.test();

    }
}
