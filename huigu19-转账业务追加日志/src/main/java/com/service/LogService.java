package com.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

public interface LogService {
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    void log(String out,String in,Double money);
}
