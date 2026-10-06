package com.service;

import com.dao.MyDao;
import com.mapper.TestMapper;
import com.utility.TestUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Clock;


@Service
    public class MyServiceV4 {
        private final Clock clock;

    public MyServiceV4(Clock clock) {
        this.clock = clock;
    }

    public void test(MyDao myDao, TestUtility testUtility, TestMapper testMapper) {
            myDao.test();
            testUtility.test();
            testMapper.test();

        }

   public void getTime()
   {
       System.out.println("The Time is : "+clock.instant());
   }
}
