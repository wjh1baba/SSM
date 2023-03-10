package com.dao;

import com.damain.Account;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;


public interface AccountDao {
    @Update("update account set money = money + #{money} where name = #{name}")
    void inmoney(@Param("name") String name, @Param("money") Double money);

    @Update("update account set money = money - #{money} where name = #{name}")
    void outmoney(@Param("name") String name,@Param("money") Double money);
}
