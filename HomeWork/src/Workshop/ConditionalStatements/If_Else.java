package Workshop.ConditionalStatements;

public class If_Else {
    public static void main(String[] args) {
        //Scenario 1
        int a = 10, b = 5;
        if(a>b) {
            System.out.println("True");
        }
        else{
                System.out.println("False");
            }
        //Scenario 2							//It will execute else part
        int c = 30, d=30;
        if(c>d) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        //Scenario 3
        int g=10, h=10, i=20;
        if (g==h) {

            System.out.println("g is equal to h");
        }
        else{
            System.out.println("h is equal to g");
        }
        System.out.println(i);

        }
    }

