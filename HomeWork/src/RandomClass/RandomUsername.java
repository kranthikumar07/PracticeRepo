package RandomClass;

import java.util.Random;

public class RandomUsername {
    public static void main(String[] args) {
         Random r =new Random();

         int result = r.nextInt(100);
         String userName = "kranthi"+result;

         System.out.println(userName);
    }
}
