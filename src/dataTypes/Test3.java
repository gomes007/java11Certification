package dataTypes;

public class Test3 {
    public static void main(String[] args) {


        double a = 295.04;
        int b = 300;
        byte c = (byte) (a + b);
        System.out.println(c);

        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double result = f * s + i;
        System.out.println(result);


        float f1 = 23.43f;
        float f2 = f1 + 0.1f;
        System.out.println(f1 == f2);

        short z = Short.MAX_VALUE;
        char g = (char) z;
        System.out.println(g);

        double z1 = 3000000000000.00;
        float z2 = (float) z1;


    }
}
