package com.jeff.bi.controller;

import com.jeff.bi.config.SpringConfig;
import com.jeff.bi.repository.UserDao;
import com.jeff.bi.repository.po.User;
import com.jeff.bi.service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class FirstController {
    @Autowired
    private FunctionService functionService;
    @Autowired
    private UserDao userDao;

    @RequestMapping(value="/first", method= RequestMethod.GET)
    public String getHello(){
        return functionService.sayHello("jeff");
    }

    @RequestMapping(value="/user/{userName}", method = RequestMethod.GET)
    public List<User> getUser(@PathVariable(value = "userName") String userName){
        return  userDao.getUserByName(userName);
    }


}


