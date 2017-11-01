package com.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kaze 2017/10/29
 */
@Api(tags = "登录模块", description = "com.web.controller.LoginController")
@RestController
public class LoginController {

    @ApiOperation(value = "登录", notes = "登录")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "username", value = "用户名", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "password", value = "用户密码", required = true, paramType = "query", dataType = "String")
    })
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password) {
        System.out.println(username);
        System.out.println(password);
        return "success";
    }

}