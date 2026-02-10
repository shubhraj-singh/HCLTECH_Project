package org.shubh;

public class GasCar extends Car{

    public GasCar(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void start() {
        System.out.println("Gas car started with engine sound");
    }

    @Override
    public String getType() {
        return "Gas";
    }
}
