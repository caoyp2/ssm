package com.ssm.service;

import com.ssm.domain.UserCard;
import java.util.List;


public interface UserCardService {

    public List<UserCard> findAll();

    public void saveUserCard(UserCard userCard);
}