package Workshop.Scanner;

import java.util.Scanner;

public class HandleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Print String values
        System.out.println("Enter String :");
        String word = input.nextLine();
        // String word1 = input.next();                              //To print first word only
        System.out.println("You entered String value is : "+ word);

        //Print Integer Values
        System.out.println("Enter Integer : ");
        int i = input.nextInt();
        System.out.println("You entered Integer value is : "+ i);

        //Print Boolean Value
        System.out.println("Enter Boolean : ");
        boolean bool = input.nextBoolean();                           //Enter True or False
        System.out.println("You entered Boolean value is : "+ bool);

        //Print char values
        System.out.println("Enter Char :");
        char c = input.next().charAt(0);
        //char c1 = input.next().charAt(1);                          //Enter at least 2 characters
        System.out.println("You entered char value is :" + c);
    }
}
