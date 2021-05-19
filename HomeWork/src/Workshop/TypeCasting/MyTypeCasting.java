package Workshop.TypeCasting;

public class MyTypeCasting {
    public static void main(String[] args) {
        //Automatic/WideningCasting
        int num1 = 10;
        double dnum1 = num1;
        System.out.println(num1);
        System.out.println(dnum1);

        //Manual/NarrowCasting
        double dnum2 = 15.5;
        int num2 = (int) dnum2;
        System.out.println(dnum2);
        System.out.println(num2);

    }
}
