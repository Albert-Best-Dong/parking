package com.dong.parking.dao;

import com.dong.parking.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  UserDao {

    void insert(User user);

    void update(User user);

    User select(String sn);

    void delete(String sn);

    List<User> selectAll();
}
