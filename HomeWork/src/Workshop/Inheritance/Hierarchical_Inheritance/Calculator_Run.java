package Workshop.Inheritance.Hierarchical_Inheritance;

public class Calculator_Run {
    public static void main(String[] args) {
        Lead obj1 = new Lead();
        int res_add1  = obj1.add(10,30);
        System.out.println(res_add1);

        QA obj2 = new QA();
        int res_add2 = obj2.add(10,90);
        System.out.println(res_add2);

    }
}
