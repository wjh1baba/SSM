package com;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dao.usersDao;
import com.domain.query.userQuery;
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


        LambdaQueryWrapper<users> lqw = new LambdaQueryWrapper();

        userQuery userQuery = new userQuery();
        userQuery.setAge(10);
        userQuery.setAge2(30);

        //lt是小于 gt是大于
        lqw.lt(users::getAge,userQuery.getAge2()).gt(users::getAge,userQuery.getAge());    //小于30,大于10

//        lqw.lt(users::getAge,20).or().gt(users::getAge,30);    //小于20,大于30
        List<users> users = usersDao.selectList(lqw);
        System.out.println(users);
    }

}
