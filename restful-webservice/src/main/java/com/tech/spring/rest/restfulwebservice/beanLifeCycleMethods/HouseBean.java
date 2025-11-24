package com.tech.spring.rest.restfulwebservice.beanLifeCycleMethods;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class HouseBean implements
        BeanNameAware, BeanFactoryAware,
        ApplicationContextAware, InitializingBean, DisposableBean {

    private String beanName;

    public HouseBean() {
        System.out.println("1. Constructor: Bean instance created");
    }

    // ======== AWARE INTERFACES ========

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("2. BeanNameAware: Bean name = " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) {
        System.out.println("3. BeanFactoryAware: BeanFactory injected");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        System.out.println("4. ApplicationContextAware: ApplicationContext injected");
    }

    // ======== INIT PHASE ========

    @PostConstruct
    public void postConstruct() {
        System.out.println("5. @PostConstruct: Called after dependency injection");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("6. InitializingBean: afterPropertiesSet()");
    }

    public void customInit() {
        System.out.println("7. Custom init-method: customInit()");
    }

    // ======== DESTROY PHASE ========

    @PreDestroy
    public void preDestroy() {
        System.out.println("8. @PreDestroy: before bean destruction");
    }

    @Override
    public void destroy() {
        System.out.println("9. DisposableBean: destroy()");
    }

    public void customDestroy() {
        System.out.println("10. Custom destroy-method: customDestroy()");
    }
}
