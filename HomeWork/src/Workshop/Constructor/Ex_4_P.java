package Workshop.Constructor;

public class Ex_4_P {
    String name;
    int age;
    public Ex_4_P(String fname,int age1){
        name = fname;
        age = age1;
    }

    public static void main(String[] args) {
        Ex_4_P obj = new Ex_4_P("John",18);
        System.out.println("My name is : " + obj.name+" and my age is : " +obj.age);

    }
}
