package Wkshp2;

public class Main {
  public static void main(String[] args) {
    BankAccount ashAccount = new BankAccount();
    ashAccount.setAccountNumber("2350909");
    ashAccount.setCustomerName("Ash Ketchum");
    ashAccount.setPhoneNumber("90249881");
    ashAccount.setEmail("acap19@gmail.com");
    ashAccount.setBalance(2000000);

    ashAccount.describeAccount();

    ashAccount.deposit(10000.00);
    ashAccount.withdraw(400);
    ashAccount.withdraw(200.55);
    ashAccount.withdraw(40);
  
  }
}
