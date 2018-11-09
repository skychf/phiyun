package com.skychf.phiyun.controller;

import com.skychf.phiyun.entity.User;
import com.skychf.phiyun.repository.UserRepository;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.Assert.*;

public class UserControllerTest {

    UserRepository userRepository;

    @Test
    public void store() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword(new BCryptPasswordEncoder().encode("admin"));
        try {
            user = userRepository.save(user);
//            System.err.println(user);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.getMessage();
            e.getCause();
            e.printStackTrace();
        }
        System.err.println(user);
    }

}