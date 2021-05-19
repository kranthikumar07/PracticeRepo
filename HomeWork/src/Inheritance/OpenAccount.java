package Inheritance;

public class OpenAccount {
     final int AGE = 18;
     final int MIN_BAL = 100;
    public void opeAcc(int amount,int age){
        if(amount == MIN_BAL && age>=AGE){
            System.out.println("Account is opened successfully " +amount+" for age over "+age);
        }
        else {
            System.out.println("Account can not be opened for under 18 and less balance");
        }


    }
}