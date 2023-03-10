package com.controller;

import com.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

//使用Controller来定义bean
@Controller
public class UserController {
    //设置当前操作访问路径
    @RequestMapping("/save")
    //设置当前操作返回值类型
    @ResponseBody
    public String save(){
        System.out.println("User save...");
        return "{'module':'springmvc'}";
    }

    //Json参数
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes){
        System.out.println("json接收的数据是"+likes);
        return "已收到json数据";
    }

    //pojo参数
    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(@RequestBody User user){
        System.out.println("pojo接收的数据是"+user);
        return "已收到pojo数据";
    }

    @RequestMapping("/listpojoParam")
    @ResponseBody
    public String listpojoParam(@RequestBody List<User> user){
        System.out.println("pojo接收的数据是"+user);
        return "已收到pojo数据";
    }

    @RequestMapping("/toJumpPage")
    public String toJumpPage(){
        System.out.println("跳转页面");
        return "index.jsp";
    }

    @RequestMapping("/toJumpPojo")
    @ResponseBody
    public User toJumpPojo(){
        System.out.println("返回json对象");
        User user = new User();
        user.setName("李冲");
        user.setAge(22);
        return user;
    }

    @RequestMapping("/tojsonlist")
    @ResponseBody
    public List<User> tojsonlist(){
        User user1 = new User();
        user1.setName("李冲");
        user1.setAge(22);

        User user2 = new User();
        user2.setName("龙瑾");
        user2.setAge(23);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        return userList;
    }
}
