package MethodsWithArg;

public class Pos_Neg {
    public void numbers(int a){
        if(a>=0){
            System.out.println("A is positive number");
        }
        else{
            System.out.println("A is negative number");
        }
    }

    public static void main(String[] args) {
        Pos_Neg obj = new Pos_Neg();
        obj.numbers(-10);
    }
}
