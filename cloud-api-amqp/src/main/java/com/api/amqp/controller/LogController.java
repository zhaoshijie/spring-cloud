package com.api.amqp.controller;

import com.alibaba.fastjson.JSONObject;
import com.api.amqp.producer.LogProducer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author kaze 2017/10/29
 */
@RestController
public class LogController {

    @Resource
    private LogProducer logProducer;

    @RequestMapping("/test")
    public String test() {
        System.out.println("test");
        return null;
    }

    @RequestMapping("/log")
    public String log(@RequestBody JSONObject json) {
        logProducer.produce(json);
        return null;
    }

}
