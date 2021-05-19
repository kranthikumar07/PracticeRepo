package Class_V11;

public class Calc2 extends Calc1{
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
        obj.add(10,20);
        obj.sub(20,25);
        obj.mul(10,20);
        obj.div(50,2);
    }
}
