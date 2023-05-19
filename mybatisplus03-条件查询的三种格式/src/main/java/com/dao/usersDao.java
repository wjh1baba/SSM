package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.domain.users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface usersDao extends BaseMapper<users> {
}
