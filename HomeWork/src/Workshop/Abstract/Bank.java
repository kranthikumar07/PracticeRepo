package Workshop.Abstract;

abstract class Bank {
    abstract void credit();
    abstract void debit();

    public void bal(){
        System.out.println("Account balance is : ");
    }

    }


