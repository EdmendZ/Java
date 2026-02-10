package com.zls.innerCar;

public class CarTest {
    public static void main(String[] args) {

        Car c = new Car(100000, "Alto\t");
        c.show();

        Car.Engine engine = new Car(100000, "Alto\t").new Engine("import\t", 50000);

        Car c1 = new Car(engine, 150000,"奔驰\t");
        c1.show();

        Car.Engine engine1 = c.new Engine("import\t", 50000);
        Car c2 = new Car(engine1, 165600, "奔驰\t");
        c2.show();

    }
}
