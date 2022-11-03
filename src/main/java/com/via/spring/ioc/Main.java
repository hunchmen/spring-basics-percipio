/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.spring.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 
 * @author via
 * 
 * @date 25 Oct 2022
 * 
 * @apiNote managing beans with Spring BeanFactory
 */
public class Main {

    public static void main(String[] args) {

        // Normal Java Object Construction
        IOTDevice myConstructedObject = new IOTDevice();

        System.out.println("IOTDevice initialized with a constructor: "
                + myConstructedObject);

        // IoC container --> BeanFactory
        System.out.println("BeanFactory container :");

        Resource resource = new ClassPathResource("applicationContext.xml");

        BeanFactory beanFactory = new XmlBeanFactory(resource);

        IOTDevice myDeviceBean =
                (IOTDevice) beanFactory.getBean("myIOTDeviceBean");

        System.out.println("XmlBeanFactory(Deprecated) -- " + myDeviceBean);

    }

}
