package Workshop.Interface.Bank;

import Workshop.Interface.Bank.Bank;

public class Lloyds implements Bank {

    public void credit() {
        System.out.println("Credit in Lloyds");
    }

    public void debit() {
        System.out.println("debit in Lloyds");

    }
}
