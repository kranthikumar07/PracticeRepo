package Workshop.Polymorphism.MethodOverloading;

public class Addition {
    public void add(int a, int b){
        int result = a+b;
        System.out.println(result);
    }
    public void add(int a, int b, int c){
        int res = a+b+c;
        System.out.println(res);
    }
    public void add(double a, double b){
        double d = a+b;
        System.out.println(d);
    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.add(10,20);
        obj.add(20,30,40);
        obj.add(12.55,15.22);
    }
}
