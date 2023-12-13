public class Account{
  private double balance= 500;
  public double getBalance(int accountId){
    return balance;
  }

public static void main(String[] args){
  Account account1 = new Account();
  double value = account1.getBalance(123456);
  System.out.println("The balance is " + value);
  }
} 