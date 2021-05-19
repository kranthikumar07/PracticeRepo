package Interface;

public class TestBank {
    public static void main(String[] args) {
        BarclaysBank driver = new BarclaysBank();
        driver.credit();
        driver.debit();

        LloydsBank driver1 = new LloydsBank();
        driver1.credit();
        driver1.debit();

        TescoBank driver2 = new TescoBank();
        driver2.credit();
        driver2.debit();
    }
}
