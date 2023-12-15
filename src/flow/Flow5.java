package flow;

public class Flow5 {
    public static void main(String[] args) {
        int i, j;
        for ( i = j = 0; ; ++i, j-- ) {
            if ( i - j > 10 ) {
                break;
            }
        }
        System.out.println(i + " " + j);
    }
}
