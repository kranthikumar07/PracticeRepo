package Workshop.Interface.Bank;

import Workshop.Interface.Bank.Bank;

public class Halifax implements Bank {
    public void credit() {
        System.out.println("Credit in Halifax");

    }
    public void debit() {
        System.out.println("debit in Halifax");

    }
}
