package com.jeff.bi.config;

import org.activiti.engine.*;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
public class ActivitiConfig {

    @Bean
    public SpringProcessEngineConfiguration processEngineConfiguration(DataSource dataSource,
                                                                       DataSourceTransactionManager transactionManager,
                                                                       ApplicationContext applicationContext){
        SpringProcessEngineConfiguration engineConfiguration = new SpringProcessEngineConfiguration();
        engineConfiguration.setDataSource(dataSource);
        engineConfiguration.setTransactionManager(transactionManager);
        engineConfiguration.setApplicationContext(applicationContext);
        engineConfiguration.setDatabaseSchemaUpdate("true");
        return engineConfiguration;
    }

    @Bean
    public ProcessEngine processEngine(SpringProcessEngineConfiguration engineConfiguration){
        return engineConfiguration.buildProcessEngine();
    }


    @Bean
    public RepositoryService repositoryService(ProcessEngine processEngine){
        return processEngine.getRepositoryService();
    }

    @Bean(value = "runtimeService")
    public RuntimeService runtimeService(ProcessEngine processEngine){
        return processEngine.getRuntimeService();
    }

    @Bean
    public TaskService taskService(ProcessEngine processEngine){
        return processEngine.getTaskService();
    }

    @Bean
    public HistoryService historyService(ProcessEngine processEngine){
        return  processEngine.getHistoryService();
    }

    @Bean
    public ManagementService managementService(ProcessEngine processEngine){
        return processEngine.getManagementService();
    }

}
