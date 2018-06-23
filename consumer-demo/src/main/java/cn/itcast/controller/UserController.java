package cn.itcast.controller;

import cn.itcast.pojo.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Created by Wzw  on ${Date} ${Time}
 */
@RestController
@RequestMapping("consumer")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> consume(@RequestParam("ids")List<Long> ids){
        return this.userService.querUserByIds(ids);
    }

}
