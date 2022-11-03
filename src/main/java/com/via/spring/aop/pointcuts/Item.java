/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.spring.aop.pointcuts;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author via
 * 
 * @date 3 Nov 2022
 */
public class Item {

    private int itemId;
    private String itemName;
    private float itemPrice;
    private int availableQuantity;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Item{" + "itemId=" + itemId + ", itemName='" + itemName + '\''
                + ", itemPrice=" + itemPrice + ", availableQuantity="
                + availableQuantity + '}';
    }

    public void printItemDetails() {

        SimpleDateFormat formatter =
                new SimpleDateFormat("MMM dd yyyy - HH:mm:ss");
        Date date = new Date();

        System.out.format("Details for item %s at %s: \n%s\n", getItemName(),
                formatter.format(date), toString());
    }

}
