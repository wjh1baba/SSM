package com.dao.impl;

import com.dao.BookDao;

public class BookDaoimpl implements BookDao {
    public void save(){
        System.out.println("book com.dao save...");
    }


    //表示bean初始化对应操作   需要配置
    public void init(){
        System.out.println("init----");
    }

    // 表示bean销毁前对应操作
    public void destory(){
        System.out.println("destory---");
    }
}
