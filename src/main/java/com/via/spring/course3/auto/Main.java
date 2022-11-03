/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.spring.course3.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author via
 * 
 * @date 3 Nov 2022
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car = (Car) appContext.getBean("carBean");

        System.out.println("\nThe car obtained from the Bean:\n" + car);
    }
}
