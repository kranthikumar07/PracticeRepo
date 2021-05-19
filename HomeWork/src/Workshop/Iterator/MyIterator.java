package Workshop.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MyIterator {
    public static void main(String[] args) {
        //String ArrayList
        ArrayList<String> cars = new ArrayList<String>();

        //Adding items to ArrayList
        cars.add("VOLVO");
        cars.add("BMW");
        cars.add("Ecosport");
        cars.add("volvo");

        //Get the Iterator
        Iterator itr = cars.iterator();

        //Looping through collection
        while(itr.hasNext()){
            System.out.println(itr.next());
        }



        }


}
