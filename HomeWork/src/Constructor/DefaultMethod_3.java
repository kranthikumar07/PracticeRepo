package Constructor;

public class DefaultMethod_3 {
    int a = 20 ;

    public DefaultMethod_3(){
        a = 30;
    }

    public static void main(String[] args) {
        DefaultMethod_3 obj = new DefaultMethod_3();
        System.out.println(obj.a);
    }
}
