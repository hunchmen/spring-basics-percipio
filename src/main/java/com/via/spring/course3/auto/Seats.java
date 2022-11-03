/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.spring.course3.auto;

/**
 * 
 * @author via
 * 
 * @date 3 Nov 2022
 */
public class Seats {

    String type;
    boolean heated;
    String color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHeated() {
        return heated;
    }

    public void setHeated(boolean heated) {
        this.heated = heated;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Seats { " +
                "Type = " + type +
                ", \nHeated = " + heated +
                ", \nColor = " + color + " }";
    }

}
