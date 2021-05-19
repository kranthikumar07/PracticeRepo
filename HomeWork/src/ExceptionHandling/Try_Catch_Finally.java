package ExceptionHandling;

public class Try_Catch_Finally {
    public static void main(String[] args) {
        //Exception in try block
        try {
            String s=null;
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("Exception Thrown :" + e);
        } finally {
            System.out.println("Finally Block executed");
        }


        //No Exception in try block
        try {
            int [] num = {1,2,3};
            System.out.println(num[2]);
            System.out.println("If no Exception in try block, it will not execute catch block");
        } catch (Exception e) {
            System.out.println("Exception Thrown :" + e);
        }
        finally {
            System.out.println("Finally Block executed");
        }
    }
}
