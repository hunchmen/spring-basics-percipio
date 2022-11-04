/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.spring.aop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 
 * @author via
 * 
 * @date 3 Nov 2022
 */
@Aspect
public class AspectConfig {

    @Pointcut("execution(void com.via.spring.aop.pointcuts.*.*())")
    private void myPointcutMethod() {}

    @Before("myPointcutMethod()")
    public void printLogo(JoinPoint jp) {

        System.out.println("\n\nLogo printed before invocation of: "
                + jp.getSignature().getName());

        System.out.println("\n*************************************\n"
                + "*************V I A J C C*************\n"
                + "*************************************");
    }

    public void printTrademark() {
        System.out.println("******* Trademark by VIA *******");
    }
}
