package com.qsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BeanLister 
{
    @Autowired
    private ApplicationContext applicationContext;

    public void listAllBeans() 
    {
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        
        System.out.println("Beans in application context:");
        for (String beanName : beanNames) 
        {
            System.out.println(beanName);
        }
    }
}

