package ArrayList;

import java.util.ArrayList;

public class EndsWith_ArrayList {
    public static void main(String[] args) {

            ArrayList<String> cars = new ArrayList<String>();
            cars.add("BMW");
            cars.add("Benz");
            cars.add("Volvo");
            cars.add("RangeRover");
            cars.add("Audi");
            cars.add("Bentley");
            cars.add("Maruthi");
            cars.add("Suzuki");

        System.out.println("Cars name ends with i ");
            for(int i=0;i<cars.size();i++){
                if(cars.get(i).endsWith("i")){
                    System.out.println(cars.get(i));
                }
            }

        }
}

