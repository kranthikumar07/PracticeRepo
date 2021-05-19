package Workshop.ConditionalStatements;

public class If_ElseIf_Else {
    public static void main(String[] args) {
        int onenum = 7;
        if(onenum == 0)
            System.out.println("no value");

        else if(onenum%2==0)
            System.out.println("Even");

        else
            System.out.println("Odd");

        //If-ElseIf-Else with curly braces
        int twonum = 4;
        if(twonum==0){
            System.out.println("No value");
        }
        else if(twonum%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }


    }
}
