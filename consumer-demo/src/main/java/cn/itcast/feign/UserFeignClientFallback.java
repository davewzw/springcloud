package cn.itcast.feign;

import cn.itcast.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @Author Created by Wzw  on ${Date} ${Time}
 */
@Component
public class UserFeignClientFallback implements UserFeignClient {
    @Override
    public User queryById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("用户查询出现异常！");
        return user;
    }
}
