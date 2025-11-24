package com.tech.spring.rest.restfulwebservice.beanLifeCycleMethods;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class HousePostProcessorBean implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        if (bean instanceof HouseBean) {
            System.out.println(">>> BeanPostProcessor BEFORE init");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        if (bean instanceof HouseBean) {
            System.out.println(">>> BeanPostProcessor AFTER init");
        }
        return bean;
    }
}
