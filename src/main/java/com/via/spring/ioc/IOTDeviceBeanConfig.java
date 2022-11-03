/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.spring.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author via
 * 
 * @date 25 Oct 2022
 * 
 * @apiNote Configuring Beans with annotations
 */
@Configuration
// @ComponentScan(basePackages = "com.via.spring.ioc")
public class IOTDeviceBeanConfig {

    @Bean(name = "IOTDeviceBean")
    public IOTDevice IOTDeviceBean() {
        return new IOTDevice();
    }
}
