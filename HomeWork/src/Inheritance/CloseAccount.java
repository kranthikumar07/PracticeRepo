package Inheritance;

public class CloseAccount extends WithDraw{
    final int AGE = 18;
    public void closeAcc(int age) {
        if ( age < AGE) {
            System.out.println("Account can not be opened for under 18 ");
        }
        else{
            System.out.println("You are allowed to open account");
        }
    }
    public static void main(String[] args) {
        CloseAccount obj = new CloseAccount();
        obj.opeAcc(100,18);
        obj.opeAcc(20,16);
        obj.max(30000);
        obj.max(25000);
        obj.closeAcc(16);
        obj.closeAcc(18);



    }

}
