/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.spring.ioc;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 
 * @author via
 * 
 * @date 25 Oct 2022
 * 
 * @apiNote Initializing Beans in an IoC container
 */
public class Main4 {

    public static void main(String[] args) {

        Resource resource = new ClassPathResource("applicationContext.xml");

        DefaultListableBeanFactory beanFactory =
                new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanReader =
                new XmlBeanDefinitionReader(beanFactory);
        beanReader.loadBeanDefinitions(resource);

        IOTDevice myDeviceBean =
                (IOTDevice) beanFactory.getBean("myIOTDeviceBean");
        IOTDevice otherDeviceBean =
                beanFactory.getBean("otherIOTDeviceBean", IOTDevice.class);

    }
}
