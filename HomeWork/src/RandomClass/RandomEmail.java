package RandomClass;

import java.util.Random;

public class RandomEmail {
    public static void main(String[] args) {
        Random r =new Random();

        int result = r.nextInt(100);
        String email = "kranthi"+result+"@testmail.com";

        System.out.println("Random Email Id :" + email);
    }

}
