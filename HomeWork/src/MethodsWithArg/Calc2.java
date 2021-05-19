package MethodsWithArg;

public class Calc2 {
    public void multiplication(int a, int b){
        int c = a*b;
        System.out.println("Multiplication of "+a+ " and "+b+ " :"+c);
    }
    public void division(int a, int b){
        int c = a/b;
        System.out.println("Division of "+a+ " and "+b+ " :"+c);
    }

    public static void main(String[] args) {
        Calc1 obj1 = new Calc1();
        Calc2 obj2 = new Calc2();
        obj1.addition(10,20);
        obj1.subtraction(60,10);
        obj2.multiplication(50,50);
        obj2.division(100,50);

    }
}