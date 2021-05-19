package MethodsWithArg;

public class Result {
   public void marks(int totalMarks) {
       if (totalMarks >= 36) {
           System.out.println("Student Passed");
       } else {
           System.out.println("Student Failed");
       }
   }
       public static void main(String[] args) {
       Result obj = new Result();
       obj.marks(36);

    }
}
