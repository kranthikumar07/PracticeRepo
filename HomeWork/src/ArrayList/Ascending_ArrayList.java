package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ascending_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(2);
        numbers.add(15);
        numbers.add(50);
        numbers.add(1);


        //Sorting the values in ascending order
        Collections.sort(numbers);
        System.out.println(numbers);

    }
}
