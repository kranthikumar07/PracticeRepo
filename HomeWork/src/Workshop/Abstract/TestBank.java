package Workshop.Abstract;

public class TestBank {
    public static void main(String[] args) {
        Halifax obj1 = new Halifax();
        obj1.credit();
        obj1.debit();
        obj1.bal();

        RBS obj2 =new RBS();
        obj2.credit();
        obj2.debit();
        obj2.bal();
    }
}
