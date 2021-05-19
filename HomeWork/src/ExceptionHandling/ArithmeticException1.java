package ExceptionHandling;

public class ArithmeticException1 extends Throwable {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 0;
        try{
            int res = 10/0;
            System.out.println(res);
        }catch(ArithmeticException ae){
            System.out.println("Arithmetic Exception");
        }
        System.out.println("Exception Bypassed");
    }
}
