package Workshop.Constructor;

public class Ex_5_P_This {
    String name;
    int age;

    public Ex_5_P_This(String x, int y){
        this.name = x;
        this.age = y;
    }

    public static void main(String[] args) {
        Ex_5_P_This obj = new Ex_5_P_This("John",18);
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
