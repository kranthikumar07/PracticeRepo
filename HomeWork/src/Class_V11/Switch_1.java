package Class_V11;

import java.util.Scanner;

public class Switch_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Number?");
        int num = scan.nextInt();

        if((num == 9)||(num == 10))
            System.out.println("Sobresaliente");
        else if((num == 7)|| (num == 8))
            System.out.println("Notable");
        else if(num == 6)
            System.out.println("Bien");
        else if(num == 5)
            System.out.println("Aprobado");
        else if((num >= 0) && (num <= 4))
            System.out.println("Suspenso");
        else
            System.out.println("Not valid");

        switch(num){
             case 0:
             case 1:
             case 2:
             case 3:
             case 4:
                System.out.println("Suspenso");
                break;
             case 5:
                System.out.println("Aprobado");
                break;
             case 6:
                System.out.println("Bien");
                break;
             case 7:
                System.out.println("Notable");
                break;
             case 8:
                System.out.println("Notable");
                break;
             case 9:
                System.out.println("Sobresaliente");
                break;
             case 10:
                System.out.println("Sobresaliente");
                break;
             default:
                System.out.println("Not valid");
                break;






        }

    }

}
