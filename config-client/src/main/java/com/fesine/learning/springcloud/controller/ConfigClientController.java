package com.fesine.learning.springcloud.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @description: 类描述
 * @author: fesine
 * @createTime:2019/9/9
 * @update:修改内容
 * @author: fesine
 * @updateTime:2019/9/9
 */
@RestController
@RefreshScope
public class ConfigClientController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @NacosValue(value = "${userName}", autoRefreshed = true)
    private String userName;

    @RequestMapping("/from")
    public String from() {
        return userName;
    }

}
