package Type_Casting;

public class NarrowCasting {
    public static void main(String[] args) {
        //Narrow casting from double to int
        double num1 = 123.66;
        int num2 = (int)num1;
        System.out.println(num1);
        System.out.println("Converted double value is: " + num2);

        //Narrow casting from float to int
        float a = 10.55f;
        int b = (int)a;
        System.out.println(a);
        System.out.println("Converted float value is: " +b);

        //Narrow casting from long to int
        long x = 150;
        int y = (int)x;
        System.out.println(x);
        System.out.println("Converted long value is: " + y);
    }
}
