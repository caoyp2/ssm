package com.ssm.test;

import com.ssm.dao.UserCardDao;
import com.ssm.domain.UserCard;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class SpringJunitTest {
    @Autowired
    UserCardDao userCardDao;

    @Test
    public void test(){

        List<UserCard> all = userCardDao.findAll();
        System.out.println(all);
    }
}