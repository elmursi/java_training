import accounts.BankAccount;
import exceptions.Account;
import exceptions.ExceptionsDemo;

public class Main {
    public static void main(String[] args) {
        var acc =  new BankAccount();

        acc.id = 1;
        acc.balance = 1000;

        System.out.printf("Account %d has balance %.2f", acc.id, acc.balance);
    }
}