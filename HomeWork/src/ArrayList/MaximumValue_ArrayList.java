package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MaximumValue_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(10);
        number.add(20);
        number.add(500);
        number.add(80);
        number.add(100);
        number.add(105);

        System.out.println("Maximum value present in ArrayList is :");

        //Printing Maximum values from ArrayList
        System.out.println(Collections.max(number));


    }
}
