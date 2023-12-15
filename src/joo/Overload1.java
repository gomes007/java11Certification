package joo;

public class Overload1 {

    static void print(int... a2) { System.out.print("int..."); }
    static void print(long a, long b) { System.out.print("long, long"); }
    static void print(Integer s1, Integer s2) { System.out.print("Integer, Integer"); }



    public static void main(String[] args) {
        int b = 15;
        print(b, b);
    }

}
