package banking;

public class Savings extends Account{

  public Savings(String id, String name, double balance) {
    super(id, name, balance);
  }
  
  public Savings(Savings source) {
    super(source);
  }

  @Override
  public Account clone() {
    // TODO Auto-generated method stub
    return new Savings(this);
  }
  @Override
  public void deposit(double amount) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public boolean withdraw(double amount) {
    // TODO Auto-generated method stub
    return false;
  }
}
