package com.tech.spring.rest.restfulwebservice.beanLifeCycleMethods;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HouseConfig {
       @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
       public HouseBean houseBean() {
           return new HouseBean();
       }

       @Bean
       public HousePostProcessorBean housePostProcessorBean() {
           return new HousePostProcessorBean();
       }
}
