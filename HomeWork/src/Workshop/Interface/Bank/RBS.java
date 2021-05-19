package Workshop.Interface.Bank;

import Workshop.Interface.Bank.Bank;

public class RBS implements Bank {
    public void credit(){
        System.out.println("Credit in RBS");
    }
    public void debit() {
        System.out.println("debit in RBS");

    }
}
