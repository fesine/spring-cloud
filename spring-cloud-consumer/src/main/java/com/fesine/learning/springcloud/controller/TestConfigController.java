package com.fesine.learning.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 类描述
 * @author: fesine
 * @createTime:2019/9/10
 * @update:修改内容
 * @author: fesine
 * @updateTime:2019/9/10
 */
@RefreshScope
@RestController
public class TestConfigController {

    @Value("${from:0}")
    private String from;

    @RequestMapping("/from")
    public String from() {
        return from;
    }
}
