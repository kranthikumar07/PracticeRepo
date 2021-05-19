package Workshop.Interface.Bank;

import Workshop.Interface.Bank.Halifax;
import Workshop.Interface.Bank.Lloyds;
import Workshop.Interface.Bank.RBS;

public class TestBank {
    public static void main(String[] args) {
        //Halifax Bank
        Halifax obj1 = new Halifax();
        obj1.credit();
        obj1.debit();

        //RBS Bank
        RBS obj2 = new RBS();
        obj2.credit();
        obj2.debit();

        //Lloyds
        Lloyds obj3 = new Lloyds();
        obj3.credit();
        obj3.debit();

    }
}