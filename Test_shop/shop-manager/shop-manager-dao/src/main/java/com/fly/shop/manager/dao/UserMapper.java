package com.fly.shop.manager.dao;

import com.fly.shop.manager.pojo.po.UserDo;


/**
 * Created by Mis.Fu on 2018/4/14.
 */
public interface UserMapper {
    UserDo findUser(UserDo user);
}
