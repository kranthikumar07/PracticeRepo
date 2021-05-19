package Workshop.Enum;

public class Ex2 {

    public enum Colour {
        BLACK,
        RED,
        ORANGE
    }

    public static void main(String[] args) {
        Colour myVar = Colour.ORANGE;
        System.out.println(myVar);
    }
}
