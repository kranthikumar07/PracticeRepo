package Abstract;

public class TestBank {
    public static void main(String[] args) {
       Halifax bank1 = new Halifax();
       bank1.credit();
       bank1.debit();
       bank1.bal();

       RBS bank2 = new RBS();
       bank2.credit();
       bank2.debit();
       bank2.bal();

    }
}
