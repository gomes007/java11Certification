package joo;

interface Movable {
    void move();
}

abstract class Vehicle implements Movable {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

final class Car extends Vehicle {
    public void move() {
        System.out.println("Car is moving");
    }
}


public class Teste {

    void drive(Car m) {
        m.move();
    }

    public static void main(String[] args) {

        Teste t = new Teste();
        t.drive(new Car());

    }

}
