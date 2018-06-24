package com.jeff.bi.service;

import com.jeff.bi.annotation.Action;
import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add(){

    }
}
