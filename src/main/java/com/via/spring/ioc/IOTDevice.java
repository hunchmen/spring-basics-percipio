/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.spring.ioc;

import org.springframework.stereotype.Component;

/**
 * 
 * @author via
 * 
 * @date 25 Oct 2022
 */
// @Component
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

    public void initBean() throws Exception {
        System.out.println(
                "IOTDevice bean has been instantiated. Inside the initBean() "
                        + "method.");
    }

    public void destroyBean() throws Exception {
        System.out.println(
                "IOTDevice bean has been destroyed. Inside the destroyBean() "
                + "method.");
    }

}
