package org.shubh;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Car gasCar = new GasCar("Toyota", "Camry", 2020);
        Car electricCar = new ElectricCar("Tesla", "Model 3", 2022);

        System.out.println(gasCar.getType() + " - " + gasCar.getBrand() + " " + gasCar.getModel() + " (" + gasCar.getYear() + ")");
        gasCar.start();

        System.out.println(electricCar.getType() + " - " + electricCar.getBrand() + " " + electricCar.getModel() + " (" + electricCar.getYear() + ")");
        electricCar.start();
    }
}
