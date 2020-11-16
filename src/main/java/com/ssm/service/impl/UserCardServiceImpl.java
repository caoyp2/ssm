package com.ssm.service.impl;

import com.ssm.dao.UserCardDao;
import com.ssm.domain.UserCard;

import com.ssm.service.UserCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userCardService")
public class UserCardServiceImpl implements UserCardService {

    @Autowired
    UserCardDao userCardDao;

    public List<UserCard> findAll() {
        System.out.println("业务层。。。。。。。。。。。");
        return userCardDao.findAll();
    }

    public void saveUserCard(UserCard userCard) {

    }
}
