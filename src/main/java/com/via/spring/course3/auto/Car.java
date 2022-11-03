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
 * @date 26 Oct 2022
 */
public class Car {

    String type;
    String model;
    double price;
    int combinedFuelEconomy;
    Engine engine;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCombinedFuelEconomy() {
        return combinedFuelEconomy;
    }

    public void setCombinedFuelEconomy(int combinedFuelEconomy) {
        this.combinedFuelEconomy = combinedFuelEconomy;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {

        return "CarBodyType = " + type + ", Model = " + model + ",\nPrice = "
                + price + ",\nCombinedFuelEconomy = " + combinedFuelEconomy
                + "mpg" + ",\n" + engine;
    }
}
