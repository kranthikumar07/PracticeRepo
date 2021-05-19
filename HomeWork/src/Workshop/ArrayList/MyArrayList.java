package Workshop.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> country = new ArrayList<String>();
        country.add("India");
        country.add("Japan");
        country.add("India");
        country.add("USA");
        country.add("UK");
        country.add("Germany");
        country.add("Paris");

        //ArrayList Size
        System.out.println(country.size());
        System.out.println(country);

        //Access item from ArrayList
        System.out.println(country.get(2));

        //Change item in ArrayList
        System.out.println(country.set(1,"Tokyo"));

        //Check item in ArrayList
        System.out.println(country.contains("India"));

        //For Loop
        for(int i = 0;i<country.size();i++){
            System.out.println(country.get(i));
        }

        //For Each Loop
        for(String i:country) {
            System.out.println(i);
        }
        //Sorting
            System.out.println("**********Sorting**********");
            Collections.sort(country);
            for(String k : country) {
                System.out.println(k);
            }
            System.out.println("**********Sorting**********");

        //Reversing
        Collections.reverse(country);
            System.out.println(country);


         //Remove item from ArrayList
            country.remove(3);
            System.out.println(country);

        //Remove ArrayList
        country.clear();
            System.out.println(country);

            //Integer ArrayList
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(10);
            numbers.add(15);
            numbers.add(20);
            System.out.println(numbers);


            //Double ArrayList
            ArrayList<Double> decnumbers = new ArrayList<Double>();
            decnumbers.add(10.1);
            decnumbers.add(15.1);
            decnumbers.add(20.1);
            System.out.println(decnumbers);

            }
        }

