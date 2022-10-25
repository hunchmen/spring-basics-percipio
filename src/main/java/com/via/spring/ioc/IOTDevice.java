/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.spring.ioc;

/**
 * 
 * @author via
 * 
 * @date 25 Oct 2022
 */
public class IOTDevice {

    String device = "Air Conditioner";
    String description = "Temperature sensor";

    public IOTDevice() {
        System.out.println("Object created successfully!");
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "IOTDevice {" + "device = '" + device + "!\'"
                + ", description = '" + description + "\'" + '}';
    }

}
