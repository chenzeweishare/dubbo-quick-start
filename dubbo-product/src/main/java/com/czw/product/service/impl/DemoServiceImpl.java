package com.czw.product.service.impl;

import com.czw.product.service.DemoService;

/**
 * @auth czw
 * @date 2019-03-13
 * @time 14:41
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "hello你好";
    }
}
