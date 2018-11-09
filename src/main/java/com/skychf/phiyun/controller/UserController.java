package com.skychf.phiyun.controller;

import com.skychf.phiyun.api.UserResult;
import com.skychf.phiyun.entity.User;
import com.skychf.phiyun.api.Result;
import com.skychf.phiyun.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user")
    public Result store(UserResult userResult) {
        User user = new User();
        user.setUsername("admin");
        user.setPassword(new BCryptPasswordEncoder().encode("admin"));
        user.setDiskRoot(UUID.randomUUID().toString().replaceAll("-", ""));
        try {
            user = userRepository.save(user);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println(user);
        }
        BeanUtils.copyProperties(user, userResult);
        System.err.println(userResult.getUsername());
        return Result.success(userResult);
    }

}
