package accounts;

public class BankAccount {
    private final static double DEFAULT_INTEREST_RATE = 0.02;
    private static double rate  = DEFAULT_INTEREST_RATE;
    private static int bankAccountCount;
    public int id;
    public double balance;

    public BankAccount() {
        this.id = ++bankAccountCount;
    }


    public BankAccount(int id, double balance) {
        // check if id is positive and doesn't exist
        if (id <= 0) {
            throw new IllegalArgumentException("Id must be positive");
        }

        System.out.println("Created a new account with id " + id);

    }

    public static void setInterestrate(double interest)
    {
        rate = interest;
    }

    public static double getInterestrate()
    {
        return rate;
    }



    //setId
    public void setId(int id) {
        this.id = id;
    }


    //getBalance
    public double getBalance() {
        return balance;
        
    }



    //Deposit
    public void deposit(double amount) {
        System.out.println("Deposited " + amount + " to account " + id);
        this.balance += amount;
    }

    //withdraw
    public void withdraw(double amount) {
        System.out.println("Withdrawing " + amount + " from account " + this.id);
        this.balance -= amount;
    }



    //toString
    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }




}
