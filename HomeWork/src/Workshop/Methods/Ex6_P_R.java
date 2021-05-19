package Workshop.Methods;

public class Ex6_P_R {
    public int myMethod6(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Ex6_P_R obj = new Ex6_P_R();
        int result = obj.myMethod6(10,20);
        System.out.println(result);
    }
}
