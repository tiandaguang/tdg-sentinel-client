package com.boot.demo.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//import com.boot.demo.stream.function.Teacher;

/**
 * @DATE 2019/11/4 20:33
 * @Description 测试请求类
 * @Author Tian Daguang
 **/
@RestController
@RequestMapping("provider")
@Slf4j
public class DemoController {

    @GetMapping(path = "send")
    public String send() throws Exception {
        log.info("可以用了！！！");
        Map<String, Object> mp = new HashMap<>();
        mp.put("code", 100);

        return JSON.toJSONString(mp);
    }
}
