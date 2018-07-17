package com.allocmem.banana.dao;

import com.allocmem.banana.model.User;

/**
 * @auther zhoudazhuang
 * @date 18-7-17 15:26
 * @description
 */
public interface UserMapper {
    User findUserById(int id);
}
