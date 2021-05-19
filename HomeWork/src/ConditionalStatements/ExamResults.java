package ConditionalStatements;

public class ExamResults {
    public void grade(int marks){
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
        ExamResults obj = new ExamResults();
        obj.grade(79);
        obj.grade(91);
        obj.grade(55);
        obj.grade(36);
        obj.grade(25);
;    }
}
