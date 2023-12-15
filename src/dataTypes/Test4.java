package dataTypes;

public class Test4 {
    public static void main(String[] args) {


        int count = 0;
        String s1 = "hello";
        String s2 = "hello";
        StringBuilder s3 = new StringBuilder(s1);
        String s4 = new String(s1);
        if (s1 == s2) count++; // line 1
        if (s1.equals(s2)) count++; // line2
        if (s1.equals(s3)) count++; // line3
        if (s1 == s4) count++; // line4
        if (s1.equals(s4)) count++; // line 5
        System.out.println(count);


    }
}
