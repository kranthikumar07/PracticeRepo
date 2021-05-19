package Class_V11;

import java.util.Scanner;

public class Switch_IntegerValue {
    public static void main(String[] args) {
        Switch_IntegerValue user = new Switch_IntegerValue();
        System.out.println("Please select the below options :");
        Scanner scan = new Scanner(System.in);
        char options = scan.next().charAt(0);
        user.selectOption(options);
    }
    public void selectOption(char options){
        switch (options){
            case 'a':
                System.out.println("int 1x=10");
                break;
            case 'b':
                System.out.println("int x = 10");
                break;
            case 'c':
                System.out.println("float x = 10.0f");
                break;
            case 'd':
                System.out.println("String x"+" = "+"10");
                break;
            default:
                System.out.println("None of above");

        }
    }
}
