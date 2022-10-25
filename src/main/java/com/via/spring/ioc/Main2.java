/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.spring.ioc;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 
 * @author via
 * 
 * @date 25 Oct 2022
 */
public class Main2 {

    public static void main(String[] args) {

        Resource resource = new ClassPathResource("applicationContext.xml");

        BeanDefinitionRegistry beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanReader =
                new XmlBeanDefinitionReader(beanFactory);
        beanReader.loadBeanDefinitions(resource);

        IOTDevice myDeviceBean =
                (IOTDevice) ((DefaultListableBeanFactory) beanFactory)
                        .getBean("myIOTDeviceBean");

        System.out
                .println("Bean from BeanDefinitionRegistry -- " + myDeviceBean);

    }
}
