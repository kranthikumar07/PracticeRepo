package Class_V11;

public class DividedBy5 {
    public static void main(String[] args) {
        int a = 100;
        System.out.println("Numbers which are divided by 5 between 1 and " + a + " are :");
        for (int i = 1; i <= a; i++) {
            if (i % 5 == 0) {
                System.out.println(i + "");
            }
        }
    }
}
