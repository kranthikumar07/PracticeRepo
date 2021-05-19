package Inheritance;

public class Calc2 extends Calc1 {
    public void mul(int a, int b) {
        int c = a * b;
        System.out.println(c);
    }

    public void div(int a, int b) {
        int c = a / b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Calc2 obj = new Calc2();
        obj.add(20,50);
        obj.sub(70,30);
        obj.mul(50,50);
        obj.div(50,25);

    }
}
