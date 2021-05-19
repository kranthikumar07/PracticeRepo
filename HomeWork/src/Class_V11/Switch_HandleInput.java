package Class_V11;

import java.util.Scanner;

public class Switch_HandleInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //String
        System.out.println("Enter String =");
        String word = scan.nextLine();
        System.out.println("Entered string is = " + word);

        //Integer
        System.out.println("Enter Integer number = ");
        int intNumber = scan.nextInt();
        System.out.println("Entered Integer number is = " + intNumber);

        //Float
        System.out.println("Enter decimal number = ");
        float decimalNumber = scan.nextFloat();
        System.out.println("Enter decimal number is = " + decimalNumber);

        //Char
        System.out.println("Enter character = ");
        char cha = scan.next().charAt(0);
        System.out.println("Entered character is = " + cha);

        //Boolean
        System.out.println("Enter boolean value = ");
        boolean bool = scan.nextBoolean();
        System.out.println("Entered boolean value is = " + bool);

    }
}
