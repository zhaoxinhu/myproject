package org.myproject.dao;

import org.apache.ibatis.annotations.Param;
import org.myproject.pojo.User;

public interface UserDao {
    
    User getUser(@Param(value = "id") int id);
}
