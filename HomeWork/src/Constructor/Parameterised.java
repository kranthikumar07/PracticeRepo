package Constructor;

public class Parameterised {
    String name;
    int age;

    public Parameterised(String x, int y){
        name = x;
        age = y;
    }

    public static void main(String[] args) {
        Parameterised obj = new Parameterised("John", 25);
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
