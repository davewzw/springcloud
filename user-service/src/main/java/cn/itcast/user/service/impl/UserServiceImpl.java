package cn.itcast.user.service.impl;

import cn.itcast.user.mapper.UserMapper;
import cn.itcast.user.pojo.User;
import cn.itcast.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @Author Created by Wzw  on ${Date} ${Time}
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User queryUserById(Long id) {
        try {
            Thread.sleep(new Random().nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return userMapper.selectByPrimaryKey(id);
    }
}
