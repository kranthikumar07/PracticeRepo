package ArrayList;

import java.util.ArrayList;

public class Startswith_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Volvo");
        cars.add("RangeRover");
        cars.add("Audi");
        cars.add("Bentley");
        cars.add("Maruthi");


        System.out.println("Car names starts with B");
        for(int i=0;i<cars.size();i++) {
            if (cars.get(i).startsWith("B")) {
                System.out.println(cars.get(i));
            }
        }

    }
}