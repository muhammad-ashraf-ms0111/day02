package Wkshp2;

public class Main {
  public static void main(String[] args) {

    //Defined constructor
    //BankAccount ashAccount = new BankAccount();
    BankAccount ashAccount = new BankAccount("2350909", "Ash Ketchum", "acap19@gmail.com", "90249881", 2000000);
    System.out.println(ashAccount.getAccountNumber());
    ashAccount.describeAccount();
    ashAccount.deposit(10000.00);
    ashAccount.withdraw(400);
    ashAccount.withdraw(200.55);
    ashAccount.withdraw(40);

    //constructor chainning and overloading
    BankAccount unoAccount = new BankAccount("Uno", "Uno@Uno.com", "11111111");
    System.out.println("Name: " + unoAccount.getCustomerName() +  ", " + "Account no.:" + unoAccount.getAccountNumber() + ", " + unoAccount.getBalance());
    
    Customer customer = new Customer("Tim", 1000,
                "tim@email.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());

        Customer thirdCustomer = new Customer("Joe", "joe@email.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmail());
  }
}
