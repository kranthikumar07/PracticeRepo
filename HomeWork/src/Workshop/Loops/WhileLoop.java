package Workshop.Loops;

public class WhileLoop {
    public static void main(String[] args) {
        //Scenario 1              //Print 1 to 10
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        //Scenario 2                 //Print 10 to 1
        int j = 10;
        while(j>=1){
            System.out.println(j);
            j--;
        }
        //Scenario 3                 //Print 1 to 10 except 5
        int k = 1;
        while(k<=10){
            if(k!=5){
                System.out.println(k);
            }
            k++;
        }
        //Scenario 4                //Print 1 to 10 except 4 and 8
        int l = 1;
        while(l<=10){
            if((l!=4) &&(l!=8)){
                System.out.println(l);
            }

            l++;
        }
    }
}
