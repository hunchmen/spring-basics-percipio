/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.via.spring.aop.pointcuts.Item;

/**
 * 
 * @author via
 * 
 * @date 3 Nov 2022
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Item item = (Item) context.getBean("itemBeanOne");
        // System.out.println("The item created: \n" + item.toString());
        item.printItemDetails();
    }
}
