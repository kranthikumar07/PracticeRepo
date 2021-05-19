package Workshop.Methods.MethodsWithArg;

public class Result {
    public void marks(int totalMarks){
        if(totalMarks>=36) {
            System.out.println("Student is Passed");
        }else{
            System.out.println("Student is failed");
        }
    }

    public static void main(String[] args) {
        Result obj = new Result();
        obj.marks(37);
        obj.marks(34);
    }
}
