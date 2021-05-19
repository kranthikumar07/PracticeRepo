package RandomClass;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();

        int rand_int1 = rand.nextInt();
        int rand_int2 = rand.nextInt(250);

        System.out.println("Random Integers :" + rand_int1);
        System.out.println("Random Integers : " + rand_int2);
    }
}
