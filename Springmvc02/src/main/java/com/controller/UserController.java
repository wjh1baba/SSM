package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//使用Controller来定义bean
@Controller

public class UserController {
    //设置当前操作访问路径
    @RequestMapping("/save")
    //设置当前操作返回值类型
    @ResponseBody
    public String save(String name,int age){
        System.out.println(name+"的年龄是"+age);
        return "{'module':'springmvc'}";
    }

    //设置当前操作访问路径
    @RequestMapping("/User")
    //设置当前操作返回值类型
    @ResponseBody
    public String User(){
        System.out.println("User...");
        return "噶了";
    }
}
