package Workshop.Access_Modifiers.Access_Modifiers_1;

public class ProtectedEx1_2 {
    public static void main(String[] args) {
        ProtectedEx1_1 obj = new ProtectedEx1_1();
        System.out.println(obj.x);

        obj.myProtectedMethod();
    }
}
