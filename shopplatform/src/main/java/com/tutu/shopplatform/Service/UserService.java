package com.tutu.shopplatform.Service;

import com.tutu.shopplatform.domain.User;

public interface UserService {
    User selectUserByName(String useName);
}
