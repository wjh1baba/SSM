package com.controller;


import com.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//使用Controller来定义bean

@Controller
public class UserController {

    //设置当前操作返回值类型
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody
    public String save(){
        System.out.println("User save...");
        return "{'module':'user save'}";
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String delect(@PathVariable Integer id){
        System.out.println("user delect..."+id);
        return "{'module':'user delect'}";
    }

    @RequestMapping(value = "/users",method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user){
        System.out.println("user update..."+user);
        return "{'module':'user update'}";
    }

}
