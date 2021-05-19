package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumValue_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);
        numbers.add(80);
        numbers.add(100);
        numbers.add(105);

        System.out.println("Minimum value present in ArrayList is :");

       //Printing Minimum values from ArrayList
        System.out.println(Collections.min(numbers));
    }
}
