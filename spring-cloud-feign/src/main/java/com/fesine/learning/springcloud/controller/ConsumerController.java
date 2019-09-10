package com.fesine.learning.springcloud.controller;

import com.fesine.learning.springcloud.service.ComputeClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
public class ConsumerController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ComputeClient client;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        return client.add(a,b);
    }
}
