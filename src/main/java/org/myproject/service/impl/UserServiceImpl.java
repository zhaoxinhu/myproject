package org.myproject.service.impl;

import org.myproject.dao.UserDao;
import org.myproject.pojo.User;
import org.myproject.remotedao.RemoteUserDao;
import org.myproject.remotepojo.RemoteUser;
import org.myproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RemoteUserDao remoteUserDao;

    public User getUser(int id) {
        System.out.println("userDao.dataSource:===========" + userDao);
        User user = userDao.getUser(id);
        System.out.println(user.toString());
        RemoteUser remoteUser = remoteUserDao.getUser(117);
        System.out.println(remoteUser.toString());
        return user;
    }
}
