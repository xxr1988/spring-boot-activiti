package com.jeff.workflow;

import com.jeff.bi.Application;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class WorkFlowTest {

    @Autowired
    private RepositoryService repositoryService;

    @Autowired
    private RuntimeService runtimeService;


    @Test
    public void deploy(){
        repositoryService.createDeployment().addClasspathResource("");
    }


    @Test
    public void startFlow(){
        runtimeService.startProcessInstanceByKey("");
    }

}
