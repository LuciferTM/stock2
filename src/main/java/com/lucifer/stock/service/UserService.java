package com.lucifer.stock.service;

import com.lucifer.stock.User;

import java.util.List;

/**
 * <p>Title:</p>
 * <p>Description: </p>
 * <p>Company:</p>
 *
 * @author Lucifer
 * @date 2017/12/12
 */
public interface UserService {
    User findById(Integer id);
    User save(String name);
    List<User> findAll();
}
