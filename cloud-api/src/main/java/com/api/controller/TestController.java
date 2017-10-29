package com.api.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kaze 2017/10/29
 */
@Api(tags = "测试模块", description = "com.web.controller.TestController")
@RestController
public class TestController {

    @ApiOperation(value = "测试", notes = "测试数据")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "value", value = "欢迎语", required = false, paramType = "query", dataType = "String", defaultValue = "Hello World")
    })
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestParam(defaultValue = "Hello World") String value) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("key", value);
        return jsonObject.toJSONString();
    }

}
