package MethodsWithArg;

public class Conditional_Max {
    public void num1(int a, int b) {
        if (a > b) {
            System.out.println(" A is the Maximum value ");
        } else {
            System.out.println("B is the Maximum value");
        }
    }

    public static void main(String[] args) {
        Conditional_Max obj = new Conditional_Max();
        obj.num1(10,20);
    }
}