package Polymorphism_Overriding;

public class Child extends Parent{
    public void shapes(float x, float y, float z){
        float f = x+y+z;
        System.out.println(z);
    }
    public void shapes(){
        System.out.println("With value");

    }
    public void shapes(double a, double b, double c, double d ) {

        double num1 = a + b + c + d;
        System.out.println(num1);
    }
        public static void main(String[] args) {
        Child obj = new Child();
        obj.shapes();
        obj.shapes(12.5f,18.3f,16.6f);
        obj.shapes(2.5,3.5,6.5,4.5);

    }
}
