package com.csc3402.lab.formlogin.service;

import com.csc3402.lab.formlogin.model.User;
import com.csc3402.lab.formlogin.dto.UserDto;

public interface UserService {

    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
}
