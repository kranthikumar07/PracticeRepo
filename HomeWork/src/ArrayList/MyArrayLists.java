package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MyArrayLists {

    public static void main(String[] args) {

        ArrayList<String> country = new ArrayList<String>();
        //Adding items to ArrayList
        country.add("India");
        country.add("USA");
        country.add("Germany");
        country.add("Australia");
        country.add("Russia");
        country.add("Canada");
        country.add("France");
        country.add("Spain");
        System.out.println(country);

        //ArrayList Size
        System.out.println(country.size());

        //Access item from Arraylist
        System.out.println(country.get(1));

        //For loop
        for(int i =0;i<country.size();i++) {
            System.out.println(country.get(i));
        }

        //For-Each loop
        for(String i:country) {
            System.out.println(i);
        }

        //Sorting
        System.out.println("**********Sorting***********");
        Collections.sort(country);
        for(String i:country) {
            System.out.println(i);
        }
        System.out.println("**********Sorting***********");

        //Reversing
        Collections.reverse(country);
        System.out.println(country);

        //Remove item from ArrayList
        country.remove("Spain");
        country.remove(4);
        System.out.println(country);


        //Change item in ArrayList
        country.set(1,"Iceland");
        System.out.println(country);

        //Remove ArrayList
        country.clear();
        System.out.println(country);


    }
}
