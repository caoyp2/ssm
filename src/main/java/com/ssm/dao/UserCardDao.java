package com.ssm.dao;

import com.ssm.domain.UserCard;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserCardDao {

    public List<UserCard> findAll();

    public void saveUserCard(UserCard userCard);
}
