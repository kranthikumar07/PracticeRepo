package PackageVariable;

public class ACM1 {
    public int a = 60;
    int b = 61;
    private int c = 62;


    void add1(){
        int c = a + b;
        System.out.println(c);
    }

    public void add2(){
        int c = a+50;
        System.out.println(c);
    }

    private void add3(){
        int c = a - b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        ACM1 obj = new ACM1();
        System.out.println(obj.c);
    }

}
