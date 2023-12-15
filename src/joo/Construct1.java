package joo;

class X {

    int num = 4;

    X() {
        System.out.println("X(): " + num);
    }

    X(int num) {
        System.out.println("X(num): " + num);
    }
}


class Y extends X {

    Y(int num) {
        this.num = num;
        System.out.println("Y(num): " + num);
    }
}


public class Construct1 {
    public static void main(String[] args) {
        Y obj = new Y(3);
    }
}
