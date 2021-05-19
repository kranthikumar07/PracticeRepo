package Workshop.Methods;

public class Ex2_P {
    public void myMethod1(int a, int b){
        int result = (a+b);
        System.out.println(result);

    }

    public static void main(String[] args) {
        Ex2_P obj = new Ex2_P();
        obj.myMethod1(10,20);
    }
}
