package ExceptionHandling;

public class
MultipleCatchBlocks {
    public static void main(String[] args) {

        try {
            //Arithmetic Exception
            int a = 30 / 0;

            // Array Exception
            /*int[] num = {1, 2, 3, 4};
            System.out.println(num[4]);*/

            //Parent Exception or null pointer Exception
            /*String s=null;
            System.out.println(s.length());*/

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}
