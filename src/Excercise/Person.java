package Excercise;

import java.lang.reflect.Field;

public class Person {
    private String name;
    private int age;

    public Person()
    {

    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("Created  " + this.name + "with age " + this.age );
    }


    public static void main(String[] args) throws Exception
    {
        Class person = Person.class;

        Field[] fields = person.getDeclaredFields();
        System.out.println(fields.length);


        var peshoo =new  Person("pesho", 20);
        var gesho =new  Person("gesho", 28);
        var stamat =new  Person("stamat", 30);
    }
}
