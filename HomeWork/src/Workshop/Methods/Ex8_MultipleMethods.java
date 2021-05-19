package Workshop.Methods;

public class Ex8_MultipleMethods {
    public void myMethod1(){
        System.out.println("Hello Method");
    }
    public void myMethod2(){
        System.out.println("Hi Method");
    }

    public static void main(String[] args) {
        Ex8_MultipleMethods obj = new Ex8_MultipleMethods();
        obj.myMethod1();
        obj.myMethod2();
    }
}
