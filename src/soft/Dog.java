package soft;

public class Dog {
    private String breed;
    private String name;
    private int age;
    private String color;



    public Dog() {};


    public Dog(String breed, String name, int age, String color) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.color = color;
    }


    public void bark() {
        System.out.println("Dog is barking");
    }


    public void eat() {
        System.out.println("Dog is eating");
    }


    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
