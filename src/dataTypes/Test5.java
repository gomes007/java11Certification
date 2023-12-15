package dataTypes;

public class Test5 {
    public static void main(String[] args) {
        String numberString = "aaa";
        int number;

        try {
            number = Integer.parseInt(numberString);
            System.out.println("Number = " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number!");
        }

        String numberString2 = "456";
        Integer numberObject;

        try {
            numberObject = Integer.valueOf(numberString2);
            System.out.println("O objeto Integer é: " + numberObject);
        } catch (NumberFormatException e) {
            System.out.println("String inválida para conversão.");
        }





    }
}
