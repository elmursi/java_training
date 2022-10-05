package accounts;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<BankAccount> accounts;


    // default constructor
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    // overloaded constructor
    public Person(String name, int age, List<BankAccount> accounts)
    {
        this.name = name;
        this.age = age;
        this.accounts = accounts;
    }

    
}
