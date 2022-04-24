package com.tutu.shopplatform.Service;

import com.tutu.shopplatform.Dao.UserDao;
import com.tutu.shopplatform.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;//注入UserDao

    @Override
    public User selectUserByName(String userName) {
        return userDao.selectUserByUserName(userName);
    }

}
