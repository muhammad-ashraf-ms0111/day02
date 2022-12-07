package Wkshp2;

public class BankAccount {
  private String accountNumber;
  private String customerName;
  private double balance;
  private String email;
  private String phoneNumber;


  public String getAccountNumber() {
    return this.accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getCustomerName() {
    return this.customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  
  //method

  public void describeAccount() {
    System.out.println("Hi " + customerName + ". Your account number is " + accountNumber + ". Your phone number and email is: " + phoneNumber + ", " + email + ". Here's your current balance: " + balance);
    
  }

  public void deposit(double depositAmt) {
    balance += depositAmt;
    System.out.println("Deposit of $" + depositAmt + ". Your new balance: $" + balance);
  }

  public void withdraw(double withdrawAmt) {
    if (balance - withdrawAmt < 0){
    System.out.println("Insufficient funds. You only have: $" + balance);
    } else {
    balance -= withdrawAmt;
    System.out.println("Withdraw of $" + withdrawAmt + ". Your new balance: $" + balance);}
  }
}


