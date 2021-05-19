package Workshop.ConditionalStatements;

public class If_Statements {
    public static void main(String[] args) {
        //Single Condition
        if (true) {
            System.out.println("Hi");
            }

        if (false) {
                System.out.println("Bye");
            }

        //Positive
        int a =10, b =5;
            if(a>b){
                System.out.println("True");
            }

        //Negative
        int c = 5, d = 10;
            if(!(c>d)){
                System.out.println("True");
            }
        //Compound Condition

        if((a>b)&&(a>c)){
            System.out.println("True");
        }
        //Using equals() method
        String str = "jan";
        if(str.equals("jan")){
            System.out.println("Month is jan");
        }

        //Using relational(==) operator
        int month = 2;
        if(month == 2){
            System.out.println("Month is Feb");
        }
        System.out.println("It is not a part of any condition");
        }
    }
