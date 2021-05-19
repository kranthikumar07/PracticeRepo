package Workshop.Exception;

public class HandleException {
    public static void main(String[] args) {
  /*
        //Arithmetic Expression
        int var1 = 10;
        int var2 = 0;
        int res = var1 / var2;
        System.out.println(res);
        System.out.println("Hello Exception");

        //Array Exception
        int[] num = {1, 2, 3};
        System.out.println(num[4]);

        //Arithmetic Exception Handling
        int v1 = 10;
        int v2 = 0;
        try {
            int res1 = v1 / v2;
            System.out.println(res1);
        } catch (ArithmeticException e) {
            System.out.println("Hello Arithmetic Expression");
        }
        System.out.println("Exception Bypassed");

        //Array Exception Handling
        try {
            int[] num1 = {1, 2, 3};
            System.out.println(num[4]);
        } catch (Exception e1) {
            System.out.println("Hello Array Exception");
        }
*/
        //Finally Handling
        try {
            int[] num2 = {1, 2, 3};
            System.out.println(num2[4]);
        } catch (Exception e) {
            System.out.println("Hello Array Exception");
        }
        finally {
            {
                System.out.println("Finally block executed");
            }

            // Multiple Exceptions Handling
            try{
                int arr[] = new int[2];
                arr[0] = 10/0;
               // arr[0] = 10;
                arr[1] = 10;
                arr[2] = 20;
            }
            catch(ArithmeticException e2){
                System.out.println("Hello Arithmetic error");
            }
            catch(ArrayIndexOutOfBoundsException e3){
                System.out.println("Array exception");
            }
        }
    }
}