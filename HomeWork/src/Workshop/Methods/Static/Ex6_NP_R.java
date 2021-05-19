package Workshop.Methods.Static;

public class Ex6_NP_R {
    public static int myMethod(){
        int a = 10;
        int b = 20;
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
        int res = myMethod();
        System.out.println(res);
    }
}
