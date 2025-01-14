package com.nb.my_app.controller;

import com.nb.my_app.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/redis")
@RestController
public class RedisController {

    private final RedisService redisService;

    @Autowired
    public RedisController(RedisService redisService) {
        this.redisService = redisService;
    }

    @PostMapping("/set")
    public String setValue(@RequestParam("key") String key,@RequestParam("value") String value){
        if (key == null){
            throw new IllegalArgumentException("key cannot be null");
        }
        redisService.save(key,value);
        return "Value set successfully";
    }

    @GetMapping("/get")
    public Object getValue(@RequestParam("key") String key){
        return redisService.get(key);
    }

    @DeleteMapping("/delete")
    public Boolean deleteValue(@RequestParam("key") String key){
        return redisService.delete(key);
    }

}
