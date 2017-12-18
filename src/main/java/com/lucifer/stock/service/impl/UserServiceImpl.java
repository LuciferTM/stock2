package com.lucifer.stock.service.impl;

import com.lucifer.stock.User;
import com.lucifer.stock.UserDao;
import com.lucifer.stock.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>Title:</p>
 * <p>Description: </p>
 * <p>Company:</p>
 *
 * @author Lucifer
 * @date 2017/12/12
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }
    @Override
    public User save(String name) {
        return userDao.save(new User(name));
    }
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
