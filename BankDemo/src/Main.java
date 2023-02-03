import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StructVersion();
        ClassVersion1();

        ClassVersion2();
        ClassVersion3();
        ClassVersion4();
        ClassVersion5();
        ClassVersion6();
    }

    public static void StructVersion() {
        System.out.println("Struct Version");

        CheckingAccountStruct C1 = new CheckingAccountStruct();
        SavingAccountStruct S1 = new SavingAccountStruct();
        Deposit(C1, 1000000);
        Withdraw(C1, 200000);
        System.out.println("Balance: " + C1.Balance);

        C1.Balance = 1000000000;        //<------------- This is Bad!
        //Deposit(S1, 1000000);         //<------------ This doesn't work!
    }
    // with the struct below we have to create functions that leverage the struct instead of calling
    // methods
    // note declaring and usage of struct type
    public static void Deposit(CheckingAccountStruct AS, double Amount) {
        AS.Balance += Amount;
    }
    public static void Withdraw(CheckingAccountStruct AS, double Amount) {
        AS.Balance -= Amount;
    }

    // here we only use methods
    // usage code here is clean while the class is messy and
    // this "pays off"
    // public attributes/fields/data memebers can access them from the function
    public static void ClassVersion1() { // what is this? a class or is a function in main? class interface with main?
        System.out.println("ClassVersion1");
        CheckingAccountV1 C1 = new CheckingAccountV1(); // creating a new object C1
        SavingAccountV1 S1 = new SavingAccountV1();

        C1.Deposit(1000000);
        C1.Withdraw(200000);
        S1.Deposit(2000000);
        S1.Withdraw(100000);
        System.out.println("Balance: " + C1.Balance);
        System.out.println("Balance: " + S1.Balance);
        // another way to change attrubites is by accessing them directly if public
        C1.Balance = 1000000000;  //<--------------- this is bad
        System.out.println(C1.Balance);
    }

    public static void ClassVersion2() {
        System.out.println("ClassVersion2");

        CheckingAccountV2 C1 = new CheckingAccountV2();
        SavingAccountV2 S1 = new SavingAccountV2();

        C1.Deposit(1000000);
        C1.Withdraw(200000);
        S1.Deposit(2000000);
        S1.Withdraw(100000);

        //C1.Balance = 1000000000;  //<--------------- this no longer works, that's good
        //System.out.println("Balance: " + C1.Balance);  //<---  this also no longer works

        System.out.println("Balance: " + C1.GetBalance());  //<---  Use a getter, aka accessor
        System.out.println("Balance: " + S1.GetBalance());
    }

    public static void ClassVersion3() {
        System.out.println("ClassVersion3");

        CheckingAccountV2 C1 = new CheckingAccountV2();
        SavingAccountV2 S1 = new SavingAccountV2();

        CovidReliefV1(C1); // the CovidRelief func must use an object of type CheckingAccountV2
        //CovidReliefV1(S1);  <---  This doesn't work!

        System.out.println("Balance: " + C1.GetBalance());
        System.out.println("Balance: " + S1.GetBalance());
    }

    public static void CovidReliefV1(CheckingAccountV2 A) {
        if (A.GetBalance() < 10000)
            A.Deposit(2000.00);
        else
            A.Deposit(600);
    }

    public static void ClassVersion4() {
        System.out.println("ClassVersion4");

        CheckingAccountV3 C1 = new CheckingAccountV3();
        SavingAccountV3 S1 = new SavingAccountV3();

        CovidReliefV2(C1);
        CovidReliefV2(S1);  //<---  This works!

        System.out.println("Balance: " + C1.GetBalance());
        System.out.println("Balance: " + S1.GetBalance());
    }
// second covid verison you need only to pass an object of either saving or checking accounts and it
    // works ? why? is Iaccount a generic ? why does the I show up?
    // it has something to do with the interface !
    // declared public interface "identifier"
    public static void CovidReliefV2(IAccount A) {
        if (A.GetBalance() < 10000) A.Deposit(2000.00);
        else A.Deposit(600);
    }

    public static void ClassVersion5() {
        System.out.println("ClassVersion5");

        List<IAccount> Accounts = new ArrayList<>();
        Accounts.add(new CheckingAccountV3());
        Accounts.add(new SavingAccountV3());

        for (IAccount A: Accounts) CovidReliefV2(A);

        for (IAccount A: Accounts) System.out.println("Balance: " + A.GetBalance());
    }

    public static void ClassVersion6() {
        System.out.println("ClassVersion6");

        List<GenericAccount> Accounts = new ArrayList<>();
        Accounts.add(new CheckingAccountV4());
        Accounts.add(new SavingAccountV4());

        CovidReliefV3(Accounts);

        for (GenericAccount A: Accounts) System.out.println("Balance: " + A.GetBalance());
    }

    public static void CovidReliefV3(List<GenericAccount> Accounts) {
        for (GenericAccount A: Accounts) {
            if (A.GetBalance() < 10000) A.Deposit(2000.00);
            else A.Deposit(600);
        }
    }

}
