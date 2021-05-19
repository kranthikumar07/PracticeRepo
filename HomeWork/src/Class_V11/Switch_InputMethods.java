package Class_V11;

import java.util.Scanner;

public class Switch_InputMethods {
        public void addition() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter first integer value");
            int a =scanner.nextInt();
            System.out.println("Please enter second integer value");
            int b = scanner.nextInt();
            int c = a+b;
            System.out.println("Addition of "+a+" and "+b+" is: " + c);
        }
    public static void main(String[] args) {
        Switch_InputMethods cv = new Switch_InputMethods();
        cv.addition();

    }

}

