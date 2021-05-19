package Workshop.Basic;

import java.util.Scanner;

public class HandleInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //String
        System.out.println("Enter string = ");
        String word = input.nextLine();
        //String word = input.next();							//For printing only first word
        System.out.println("Entered string is = " + word);

        //Integer
        System.out.println("Enter Integer number = ");
        int intNumber = input.nextInt();
        System.out.println("Entered Integer number is = " + intNumber );

        //Float
        System.out.println("Enter decimal no. = ");
        float decimalNumber = input.nextFloat();
        System.out.println("Entered Decimal number is = " + decimalNumber);

        System.out.println("Enter character = ");
        char cha = input.next().charAt(0);
        //char cha = input.next().charAt(1);					//Enter at least 2 characters
        System.out.println("Entered character is = " + cha);

        //Boolean
        System.out.println("Enter boolean value = ");			//Enter True or False
        boolean bool = input.nextBoolean();
        System.out.println("Entered  boolean value is = " + bool);

    }

}
