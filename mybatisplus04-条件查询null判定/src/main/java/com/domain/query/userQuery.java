package com.domain.query;

import com.domain.users;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

@Data
public class userQuery extends users {
    private Integer age2;
}
