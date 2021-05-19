package Workshop.Methods.MethodsWithArg;

public class Calc2 {
    public void mul(int a, int b) {
        int c = a * b;
        System.out.println("Mul of " + a + " and " + b + " :" + c);
    }

    public void div(int a, int b) {
        int c = a / b;
        System.out.println("div of " + a + " and " + b + " :" + c);
    }

    public static void main(String[] args) {
        Calc1 obj = new Calc1();
        Calc2 obj1  = new Calc2();
        obj.add(10,20);
        obj.sub(20,30);
        obj1.div(50,5);
        obj1.mul(10,5);
    }
}