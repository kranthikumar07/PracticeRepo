package Workshop.Inheritance.Multilevel_Inheritance;

public class Calculator_Run {
    public static void main(String[] args) {
        QA obj = new QA();
        int res_add= obj.add(10,20);
        int res_sub = obj.sub(50,20);
        int res_mul = obj.mul(25,5);

        System.out.println(res_add);
        System.out.println(res_sub);
        System.out.println(res_mul);
    }
}
