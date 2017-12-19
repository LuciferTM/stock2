package com.lucifer.stock.dao;

import com.lucifer.stock.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * <p>Title:</p>
 * <p>Description: </p>
 * <p>Company:</p>
 *
 * @author Lucifer
 * @date 2017/12/12
 */

public interface UserDao extends JpaRepository<User, Serializable> {
    User findById(Integer id);
}

