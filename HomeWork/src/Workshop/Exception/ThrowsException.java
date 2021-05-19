package Workshop.Exception;

public class ThrowsException {
    public static void main(String[] args) {
        verifyAge(14);
    }
     static void verifyAge(int age){
        if(age<18){
            throw new ArithmeticException("Not Allowed");
        }
        else{
            System.out.println("Allowed");
        }

        }
    }

