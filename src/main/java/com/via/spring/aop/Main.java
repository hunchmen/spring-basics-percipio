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

        Item item3 = new Item();
        item3.setItemId(110);
        item3.setItemName("Butter");
        item3.setItemPrice(5.99f);
        item3.setAvailableQuantity(8);

        Item item4 = new Item();
        item4.setItemId(113);
        item4.setItemName("Honey");
        item4.setItemPrice(7.00f);
        item4.setAvailableQuantity(4);

        myList.addItemToList(item3);
        myList.addItemToListAtIndex(0, item4);

        item1.printItemDetails();
        item2.printItemDetails();

        myList.printNumItems();
        myList.displayItemList();


    }
}
