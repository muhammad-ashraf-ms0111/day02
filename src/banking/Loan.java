package banking;

public class Loan extends Account{
  
  public Loan(String id, String name, double balance) {
    super(id, name, balance);
  }

  public Loan(Loan source){
    super(source);
  }

  @Override
  public Account clone() {
    // TODO Auto-generated method stub
    return new Loan(this);


  }
  @Override
  public void deposit(double amount) {
    
    
  }

  @Override
  public boolean withdraw(double amount) {
    
    return false;
  }
  }


