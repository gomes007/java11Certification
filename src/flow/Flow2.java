package flow;

public class Flow2 {

    public static void main(String[] args) {

        var num = 2;
        switch (num + 2) { // line 6
            case 1:
                System.out.println("Case1: Value is: " + num);
                break;
            case 2:
                System.out.println("Case2: Value is: " + num);
                break;
            default: // line 13
                System.out.println("Default: Value is: " + num);
                break;
            case 3:
                System.out.println("Case3: Value is: " + num);
                break;
            case 4:
                System.out.println("Case4: Value is: " + num);
                break;
        }

    }
}

// byte, short, int, char, String, enum
