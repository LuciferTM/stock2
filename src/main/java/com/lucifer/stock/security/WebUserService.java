package com.lucifer.stock.security;

import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * <p>Title:</p>
 * <p>Description: </p>
 * <p>Company:</p>
 *
 * @author Lucifer
 * @date 2017/12/18
 */
public interface WebUserService extends UserDetailsService{
    void createDefaultAdmin() throws Exception;
}
