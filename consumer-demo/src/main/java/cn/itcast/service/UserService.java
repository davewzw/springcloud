package cn.itcast.service;

import cn.itcast.dao.UserDao;
import cn.itcast.feign.UserFeignClient;
import cn.itcast.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Created by Wzw  on ${Date} ${Time}
 */
@Service
public class UserService {
 /*   @Autowired
    private UserDao userDao;*/
    @Autowired
    private UserFeignClient userFeignClientl;


    public List<User> querUserByIds(List<Long> ids){

        List<User> users = new ArrayList<>();
        for (Long id : ids) {
            User user = this.userFeignClientl.queryById(id);
            users.add(user);
        }
        return users;
    }
}
