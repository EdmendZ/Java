package com.zls.innerCar;

public class Car {
    private double price;

    private String brand;

    private Engine engine;

    class Engine {

        private String type;

        private double price;

        public Engine(String type, double price) {
            this.type = type;
            this.price = price;
        }

        public void show() {
            System.out.println(brand + "The car is equipped with " + type + "engine, the price is" + price);
            // If an inner class contains a member variable with the same name as a variable in the outer class, the outer class variable must be accessed using the syntax OuterClassName.this.variableName.
            System.out.println("The cars total price is " + Car.this.price);
        }
    }

    public Car(double price, String brand) {
        this.brand = brand;
        this.engine = new Engine("国产\t", 20000);
        this.price = price + engine.price;
    }
    public Car(Engine engine, double price, String brand) {
        this.brand = brand;
        this.engine = engine;
        this.price = price + engine.price;
    }

    public void show() {
        this.engine.show();
    }
}
