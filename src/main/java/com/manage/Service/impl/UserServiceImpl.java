package com.manage.Service.impl;

import com.manage.Service.UserService;
import com.manage.dao.UserDao;
import com.manage.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Edward_Liu
 * @date 2022-11-29 14:29
 */
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserDao userDao;


    @Override
    public boolean userSave(User user)
    {
        return userDao.userSave(user) > 0;
    }

    @Override
    public boolean userUpdateAll(User user)
    {
        return userDao.userUpdateAll(user) > 0;
    }

    @Override
    public boolean userGet(String name, String password)
    {
        return userDao.userGet(name, password) > 0;
    }

    @Override
    public List<User> userGetAll()
    {
        return userDao.userGetAll();
    }
}
