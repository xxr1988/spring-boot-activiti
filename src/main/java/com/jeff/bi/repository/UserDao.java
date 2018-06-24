package com.jeff.bi.repository;

import com.jeff.bi.repository.po.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserDao {
    List<User> getUserByName(String userName);
}
