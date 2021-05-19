package Workshop.Methods;

public class Ex7_NP_R {
    public int myMethod7(){
        int a = 10;
        int b = 20;
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Ex7_NP_R obj = new Ex7_NP_R();
        int result = obj.myMethod7();
        System.out.println(result);
    }
}
