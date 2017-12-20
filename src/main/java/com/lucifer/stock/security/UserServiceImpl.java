package com.lucifer.stock.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>Title:</p>
 * <p>Description: </p>
 * <p>Company:</p>
 *
 * @author Lucifer
 * @date 2017/12/18
 */
@Service("userDetailsService")
public class UserServiceImpl implements WebUserService {


//    @Autowired
//    private PasswordEncoder passwordEncoder;

    @Override
    public void createDefaultAdmin() throws Exception {

    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
