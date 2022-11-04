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
import com.via.spring.aop.pointcuts.ItemList;

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

        // Item item = (Item) context.getBean("itemBeanOne");
        // // System.out.println("The item created: \n" + item.toString());
        // // item.printItemDetails();
        // System.out.println("The item created: \n" + item.toString());
        // System.out.println("The item name: \n" + item.getItemName());

        Item item1 = (Item) context.getBean("itemBeanOne");
        Item item2 = (Item) context.getBean("itemBeanTwo");

        ItemList myList = (ItemList) context.getBean("listBean");

        item1.printItemDetails();
        item2.printItemDetails();

        myList.printNumItems();
        myList.displayItemList();
    }
}
