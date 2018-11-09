package com.skychf.phiyun.repository;

import com.skychf.phiyun.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
