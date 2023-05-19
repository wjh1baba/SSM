package com;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dao.usersDao;
import com.domain.users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisplusApplicationTests {

    @Autowired
    private usersDao usersDao;

    @Test
    void SelectPage(){
        Page page = new Page(1, 2);
        usersDao.selectPage(page,null);
        System.out.println("当前页码"+page.getCountId());
        System.out.println("每页行数"+page.getSize());
        System.out.println("一共多少页"+page.getPages());
        System.out.println("一共多少条数据"+ page.getTotal());
        System.out.println("查询出来的数据"+page.getRecords());
    }

    @Test
    void testGet(){

//        //第一种方式    age可能出错而报错
//        QueryWrapper qw = new QueryWrapper();
//        //it()  不包括20
//        qw.lt("age",20);
//        List list1 = usersDao.selectList(qw);
//        System.out.println(list1);

        //第三种方式
        LambdaQueryWrapper<users> lqw = new LambdaQueryWrapper();
        //lt是小于 gt是大于
        lqw.lt(users::getAge,30).gt(users::getAge,10);    //小于30,大于10
//        lqw.lt(users::getAge,20).or().gt(users::getAge,30);    //小于20,大于30
        List<users> users = usersDao.selectList(lqw);
        System.out.println(users);
    }

}
