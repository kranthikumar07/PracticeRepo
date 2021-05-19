package ArrayList;

import java.util.ArrayList;

public class Size_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Volvo");
        cars.add("RangeRover");
        cars.add("Audi");
        cars.add("Bentley");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("Size of ArrayList : " + cars.size());

        //Adding new value
        cars.add(1, "Maruthi");
        System.out.println("After adding new value at Index 1");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));

        }
        System.out.println("Size of new ArrayList : " + cars.size());

        //Remove item from ArrayList
        System.out.println("After Removing items from ArrayList");
        cars.remove(3);
        cars.remove("Audi");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("Latest size of ArrayList : " + cars.size());

        }
    }

