package com.dao.impl;

import com.dao.ResourcesDao;
import org.springframework.stereotype.Component;

@Component
public class ResourcesDaoimpl implements ResourcesDao {

    public boolean readResources(String url,String password) {
        return password.equals("root");
    }
}
