package Interface;

public class TescoBank implements Bank {
    public void credit(){
        System.out.println("Amount credit from Tesco");
    }
    public void debit(){
        System.out.println("Amount debited from Tesco");
    }

}
