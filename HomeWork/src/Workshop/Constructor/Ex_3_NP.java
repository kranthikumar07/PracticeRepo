package Workshop.Constructor;

public class Ex_3_NP {
    int a =10;
    public Ex_3_NP(){
        a = 30;
    }

    public static void main(String[] args) {
        Ex_3_NP obj = new Ex_3_NP();
        System.out.println(obj.a);
    }
}
