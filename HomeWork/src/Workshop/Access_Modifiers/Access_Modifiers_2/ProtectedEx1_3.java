package Workshop.Access_Modifiers.Access_Modifiers_2;

import Workshop.Access_Modifiers.Access_Modifiers_1.ProtectedEx1_1;

public class ProtectedEx1_3 extends ProtectedEx1_1{
    public static void main(String[] args) {

        ProtectedEx1_3 obj = new ProtectedEx1_3();
        System.out.println(obj.x);

        obj.myProtectedMethod();
    }
}
