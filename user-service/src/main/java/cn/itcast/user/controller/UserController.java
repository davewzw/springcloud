package cn.itcast.user.controller;

import cn.itcast.user.pojo.User;
import cn.itcast.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Created by Wzw  on ${Date} ${Time}
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("user/{id}")
    public User test(@PathVariable("id")Long id){
        return userService.queryUserById(id);
    }
}
