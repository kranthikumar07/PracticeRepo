package Inheritance;

public class WithDraw extends OpenAccount{
    public void max(int withdraw) {
        if (withdraw <= 25000) {
            System.out.println("You are allowed to withdraw money");
        } else {
            System.out.println("You are not allowed to withdraw money");
        }
    }
    }





