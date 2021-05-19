package Constructor;

public class DefaultMethod {
    static int age;
    static float height;
    static boolean status;
    static String name;
    static char gender;

    //If we write here it will not print below values
   /* public DefaultMethod(){
        int age = 20;
        float height = 1.80f;
        boolean status = true;
        String name ="kranthi";
        char gender = 'M';

   }*/

    public static void main(String[] args) {
        int age = 20;
        float height = 1.80f;
        boolean status = true;
        String name ="kranthi";
        char gender = 'M';

        System.out.println("Age:" +age);
        System.out.println("height:" +height);
        System.out.println("status:" +status);
        System.out.println("name:"+name);
        System.out.println("gender:"+gender);

    }

}
