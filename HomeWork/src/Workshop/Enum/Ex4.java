package Workshop.Enum;

public class Ex4 {

    public enum Color {
        BLUE,
        BLACK,
        RED
    }

    public static void main(String[] args) {
        for(Color myVar: Color.values()){
            System.out.println(myVar);
        }
    }
}
