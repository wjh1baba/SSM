package com.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface LogDao {
    @Insert("insert into log(info,createDate) value(#{info},now())")
    void log(String info);
}
