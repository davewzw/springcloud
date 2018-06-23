package cn.itcast.feign;

import cn.itcast.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author Created by Wzw  on ${Date} ${Time}
 */
@FeignClient(value = "user-service",fallback = UserFeignClientFallback.class)
public interface UserFeignClient {
    @GetMapping("user/user/{id}")
    User queryById(@PathVariable("id")Long id);
}
