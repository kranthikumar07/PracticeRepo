package Workshop.Polymorphism.MethodOverriding;

public class Parent {
    public void shapes(){
        System.out.println("No shapes");
    }
    public void shapes(int a, int b,int c){
        int res = a+b;
        System.out.println(res);
    }
    public void shapes(float a, float b){
        float f = a+b;
        System.out.println(f);
    }

}
