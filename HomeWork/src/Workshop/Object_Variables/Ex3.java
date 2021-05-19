package Workshop.Object_Variables;

public class Ex3 {
    String str = "Hello object";
    int num  = 10;

    public static void main(String[] args) {
        Ex3 obj = new Ex3();
        obj.str = "New object";
        obj.num = 20;

        System.out.println(obj.str);
        System.out.println(obj.num);
    }
}
