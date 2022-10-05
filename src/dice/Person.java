package dice;

public class Person {
    private String name;
    private String surname;
    //age
    private int age;

    public Person() {};

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void eat() {
        System.out.println("Person is eating");
    }

    public void sleep() {
        System.out.println("Person is sleeping");
    }

    public void walk() {
        System.out.println("Person is walking");
    }

    
}
