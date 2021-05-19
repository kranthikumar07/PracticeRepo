package MethodsWithArg;

public class Conditional_Min {
      public void num1(int a, int b) {

        if (a > b) {
            System.out.println(" A is the Minimum value ");
        } else {
            System.out.println("B is the Minimum value");
        }
    }

    public static void main(String[] args) {
        Conditional_Min obj = new Conditional_Min();
        obj.num1(10,20);
    }
}
