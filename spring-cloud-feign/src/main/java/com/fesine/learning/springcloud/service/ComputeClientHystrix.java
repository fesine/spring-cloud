package com.fesine.learning.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @description: 类描述
 * @author: fesine
 * @createTime:2019/9/10
 * @update:修改内容
 * @author: fesine
 * @updateTime:2019/9/10
 */
@Component
public class ComputeClientHystrix implements ComputeClient {
    @Override
    public Integer add(Integer a, Integer b) {
        return -9999;
    }
}
