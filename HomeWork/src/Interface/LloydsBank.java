package Interface;

public class LloydsBank implements Bank {
    public void credit(){
        System.out.println("Amount credit from Lloyds");
    }
    public void debit(){
        System.out.println("Amount debited from Lloyds");
    }
}

