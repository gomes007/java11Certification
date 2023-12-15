package flow;

public class Flow6 {
    public static void main(String[] args) {

        int i = 0, j = 5, k;

        do {
            k = i;
        } while ( i++ < --j);
        System.out.println(k);

    }
}
