package Workshop.Enum;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Ex3 {
    public enum Color {
        BLUE,
        BLACK,
        RED
    }

    public static void main(String[] args) {
        Color myVar = Color.RED;
        switch (myVar){
            case BLUE:
                System.out.println("Color is Blue");
                break;
            case BLACK:
                System.out.println("Color is Black");
                break;
            case RED:
                System.out.println("Color is Red");
                break;

        }
    }
}
