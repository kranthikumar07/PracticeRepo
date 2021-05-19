package ConditionalStatements;

public class Even_Odd {
    public void numbers(int a){
        if(a%2 == 0){
            System.out.println("Entered number is Even");
        }
        else{
            System.out.println("Entered number is Odd");
        }
    }

    public static void main(String[] args) {
        Even_Odd obj =new Even_Odd();
        obj.numbers(15);
        obj.numbers(10);
    }
}
