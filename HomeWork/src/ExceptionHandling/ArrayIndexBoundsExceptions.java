package ExceptionHandling;

public class ArrayIndexBoundsExceptions {
    public static void main(String[] args) {
        try {
            int[] num = {1, 2, 3, 4};
            System.out.println(num[4]);
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Array Exception");
        }

    }
}
