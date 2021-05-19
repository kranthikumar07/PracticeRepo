package Constructor;

public class Parameterised_This {
    String name;
    int age;
    public Parameterised_This(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Parameterised_This obj = new Parameterised_This("John",25);
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
