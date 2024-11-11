package com.nb.my_app.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.nb.my_app.mapper")
public class MyBatisConfig {
    // 配置代码
}
