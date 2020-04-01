package com.xo.shop.user.service;

import com.xo.shop.dao.UserDao;
import com.xo.shop.model.User;
import com.xo.shop.vo.DbUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created By willz
 * Date : 2020/3/31
 * Time: 15:15
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserDao userDao;
    @Override
    public UserDetails loadUserByUsername(String userNameOrEmail) throws UsernameNotFoundException {
        User user = userDao.selectByUserNameOrEmail(userNameOrEmail);
        if (user == null) {
            throw new UsernameNotFoundException("该用户不存在");
        }
       return new DbUserDetails(user);
    }
}
