package Workshop.Collections;
import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<String,String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England","London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("USA", "Washington");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington");
        System.out.println(capitalCities);

        //Access item from HashMap
        System.out.println(capitalCities.get("England"));

        //Check key/value in HashMap
        System.out.println(capitalCities.containsKey("England"));
        System.out.println(capitalCities.containsValue("London"));

        //Change item in HashMap
        capitalCities.replace("USA","Washington","NewYork");
        System.out.println(capitalCities);

        //HashMap Size
        System.out.println(capitalCities.size());

        //For-Each Loop for Print keys
        for(String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        //For-Each Loop for Print values
        for(String j : capitalCities.values()) {
            System.out.println(j);
        }

        //Remove item from HashMap
        capitalCities.remove("England");
        System.out.println(capitalCities);


        //Remove HashMap
        capitalCities.clear();
        System.out.println(capitalCities);

        //Integer HashMap
        HashMap<String, Integer> people = new HashMap<String, Integer>();

         // Add keys and values (Name, Age)
         people.put("John", 32);
         people.put("Steve", 30);
         people.put("Angie", 33);

           for (String k : people.keySet()) {
              System.out.println("key: " + k + " value: " + people.get(k));
            }


        }
        }


