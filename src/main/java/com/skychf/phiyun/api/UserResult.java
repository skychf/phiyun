package com.skychf.phiyun.api;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserResult {
    private Integer id;

    private String username;
}
