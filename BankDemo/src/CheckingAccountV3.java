
// interface is keyworded here ? to implement ? ok but why ?
// in main we have that covid relif function and then ? ohhh abstract? like
// the body of the class methods is created in the calss itself? while the interface
// uses the methods but isnt necesarly of the same class?
public class CheckingAccountV3 implements IAccount{
    private double Balance;
    public String AccountNumber;
    public void Deposit(double Amount) { Balance += Amount; }
    public void Withdraw(double Amount) { Balance -= Amount; }
    public double GetBalance() { return Balance; }
}
