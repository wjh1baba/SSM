package com.service;

import com.damain.Account;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.io.IOException;
import java.util.List;

//默认只有运行时异常（NullPointException、算术运算异常）和Error（error通常是虚拟机出错，如内存溢出，StackOverFlow）才会进行事务的回滚
public interface AccountService {
    @Transactional()   //设置事务管理方法
//    @Transactional(rollbackFor = {IOException.class})   //把IOException添加到事务回滚中
    public void transfor(String out,String in,Double money) throws IOException;

}
