/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author via
 * 
 * @date 25 Oct 2022
 * 
 * @apiNote Loading Beans with an ApplicationContext
 */
public class Main3 {

    public static void main(String[] args) {

        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        IOTDevice myDeviceBean =
                (IOTDevice) appContext.getBean("myIOTDeviceBean");
        IOTDevice otherDeviceBean =
                appContext.getBean("myIOTDeviceBean", IOTDevice.class);

        myDeviceBean.setDevice("Fridge");
        myDeviceBean.setDescription("Temperature gauge for the freezer");

        otherDeviceBean.setDevice("Diswasher");
        otherDeviceBean.setDescription("Monitors water flow");

        System.out.println("Bean from ApplicationContext:\n" + myDeviceBean);
        System.out.println("Other Bean: " + otherDeviceBean);

    }
}
