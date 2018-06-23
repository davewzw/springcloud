package cn.itcast.user.service;

import cn.itcast.user.pojo.User;

/**
 * @Author Created by Wzw  on ${Date} ${Time}
 */
public interface IUserService {
    User queryUserById(Long id);
}
