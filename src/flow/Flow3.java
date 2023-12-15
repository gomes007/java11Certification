package flow;

public class Flow3 {


    public static void main(String[] args) {
        int val = 4;
        char i = 10;
        long j = -val * 3 + i % 10;
        System.out.println(j);


        boolean flag = true;
        int a = 10, b = 20;
        do {
            a++;
            if (a == 15)
                flag = false;
            b -=2;
        } while (flag);

        System.out.println(b);



    }
}
