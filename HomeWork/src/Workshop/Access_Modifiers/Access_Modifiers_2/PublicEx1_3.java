package Workshop.Access_Modifiers.Access_Modifiers_2;

import Workshop.Access_Modifiers.Access_Modifiers_1.PublicEx1_1;

public class PublicEx1_3 {
    public static void main(String[] args) {
        PublicEx1_1 obj = new PublicEx1_1();
        System.out.println(obj.x);

        obj.myPublicMethod();
    }
}
