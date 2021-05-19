package DefaultMethods;

class CustomerDetails {
    String name = "John";
    int deposit = 10000;
    int withdraw = 5000;
    int bal = deposit-withdraw;

    void details(){
        System.out.println("Customer Name : "+name);
    }
    void credit(){
        System.out.println("Customer deposit money : "+ deposit);

    }
    void debit(){
        System.out.println("Customer withdraw money : " + withdraw);

    }
    void bal(){
        System.out.println("Balance : "+bal);
    }




}
