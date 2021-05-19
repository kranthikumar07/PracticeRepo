package Interface;

class BarclaysBank implements Bank {
    public void credit(){
        System.out.println("Amount credit from Barclays");
    }
    public void debit(){
        System.out.println("Amount debited from Barclays");
    }
}
