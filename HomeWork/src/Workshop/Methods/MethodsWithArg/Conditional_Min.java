package Workshop.Methods.MethodsWithArg;

public class Conditional_Min {
    public void myMethod1(int a, int b) {
        if (a < b) {
            System.out.println("A is Min");
        } else {
            System.out.println("B is min");
        }
    }

    public static void main(String[] args) {
        Conditional_Min obj = new Conditional_Min();
obj.myMethod1(10,20);
}
}