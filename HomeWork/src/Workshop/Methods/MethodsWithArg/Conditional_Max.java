package Workshop.Methods.MethodsWithArg;

public class Conditional_Max {
    public void myMethod(int a, int b){
        if(a>b) {
            System.out.println("A is Max");
        }else{
            System.out.println("B is max");
        }

    }

    public static void main(String[] args) {
        Conditional_Max obj = new Conditional_Max();
        obj.myMethod(10,200);
    }
}
