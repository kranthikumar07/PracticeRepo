package MethodsWithArg;

public class Grade {
    public void percent(int marks){
        if(marks>=90){
            System.out.println("Grade A");
        }
        else if(marks>=70 && marks<=89){
            System.out.println("Grade B");
        }
        else if(marks>=37 && marks<=69){
            System.out.println("Grade C");
        }
        else if(marks>=36){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

    }

    public static void main(String[] args) {
        Grade obj = new Grade();
        obj.percent(70);
    }
}
