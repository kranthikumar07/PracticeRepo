package MethodsWithArg;

public class RelationalOperator {
    public void comparisons(int a, int b) {
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);
    }

    public static void main(String[] args) {
        RelationalOperator obj = new RelationalOperator();
        obj.comparisons(10,20);
    }
}