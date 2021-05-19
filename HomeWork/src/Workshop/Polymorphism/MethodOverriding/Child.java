package Workshop.Polymorphism.MethodOverriding;



public class Child extends Parent {
    public void shapes(){
        System.out.println("With shapes");
    }
    public void shapes(int a, int b, int c, int d){
        int result = a+b+c+d;
        System.out.println(result);
    }
    public void shapes(double a, double b){
        double d = a+b;
        System.out.println(d);

    }

    public static void main(String[] args) {
        Child obj1 = new Child();
        obj1.shapes();
        obj1.shapes(10,20,30,55);
        obj1.shapes(12.25,16.25);


/*
        Parent obj2 = new Parent();
        obj2.shapes();
        obj2.shapes(20,30);
        obj2.shapes(12.6f,23.23f);

        Parent obj3 = new Child();
        obj3.shapes(12.6f,2.3f);
        obj1.shapes();
        obj1.shapes(10,20,30,40);
        */




    }
}
