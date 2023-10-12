package Interfaces;

public class Person implements Info {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("hello");
    }


    @Override
    public void showInfo() {
        System.out.println("Name of this person is"+name);
    }
}

