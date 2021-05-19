package Polymorphism_MethodOverloading;

public class Shapes_1 {
    public void shape(int x, int y , int z){

        int num = x+y+z;
        System.out.println(num);
    }
    public void shape(){
        System.out.println("No value");

    }
    public void shape(int x, int y ){

        int z = x+y;
        System.out.println(z);
    }
    public void shape(double a, double b){
        double c = a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Shapes_1 obj = new Shapes_1();
        obj.shape();
        obj.shape(10.2,20.5);
        obj.shape(10,22,33);
        obj.shape(20,30);
    }

}
