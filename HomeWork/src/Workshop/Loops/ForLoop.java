package Workshop.Loops;

public class ForLoop {
    public static void main(String[] args) {
        //Scenario 1		        //Print 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //Scenario 2		        //Print 10 to 1
        for (int j = 10; j >= 1; j--) {
            System.out.println(j);
        }
        //Scenario 3		        //Print 1 to 10 except 5
        for (int k = 1; k <= 10; k++) {
            if (k != 5) {
                System.out.println(k);
            }
            //Scenario 4		        //Print 1 to 10 except 4 & 8
            for (int l = 1; l <= 10; l++) {
                if ((l != 4) && (l != 8)) {
                    System.out.println(l);
                }
            }
            //Scenario 5
            for (int m = 1; m < 10; m++) {
                if ((m % 2 == 0)) {
                    System.out.println(m);
                }
            }
            //Scenario 6                    //Print even numbers between 1 to 10
            for(int i=0;i<=10;i=i+2){
                System.out.println(i);
            }
        }

    }
}

