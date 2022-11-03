/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author via
 * 
 * @date 25 Oct 2022
 * 
 * @apiNote Configuring beans with annotations
 */
public class Main5 {

    public static void main(String[] args) {

        // ApplicationContext appContext = new AnnotationConfigApplicationContext(
        // IOTDeviceBeanConfig.class);
        //
        // IOTDevice myFirstDeviceBean =
        // (IOTDevice) appContext.getBean("IOTDeviceBean");
        //
        // myFirstDeviceBean.setDevice("Fridge");
        // myFirstDeviceBean.setDescription("Temperature gauge for the freezer");
        //
        // System.out.println("First Bean: " + myFirstDeviceBean);

        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("\nAbout to retrieve the instantiated beans...\n");

        IOTDevice myFirstDeviceBean =
                (IOTDevice) appContext.getBean("myIOTDeviceBean");
        IOTDevice otherDeviceBean =
                (IOTDevice) appContext.getBean("otherIOTDeviceBean");

        myFirstDeviceBean.setDevice("Fridge");
        myFirstDeviceBean.setDescription("Temperature gauge for the freezer");

        otherDeviceBean.setDevice("Diswasher");
        otherDeviceBean.setDescription("Monitors water flow");

        System.out.println("First Bean: " + myFirstDeviceBean);
        System.out.println("Second Bean: " + otherDeviceBean);

    }
}
