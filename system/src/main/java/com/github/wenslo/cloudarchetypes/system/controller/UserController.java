package com.github.wenslo.cloudarchetypes.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("system/user")
public class UserController {

    @RequestMapping("queryByPage")
    public String queryByPage(){
        return "USER PAGE";
    }
}
