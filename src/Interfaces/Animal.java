package Interfaces;

public class Animal implements Info{
    public int id;


public void sleep(){
    System.out.println("я сплю");}

    public Animal (int id){
        this.id = id;
    }

   @Override
    public void showInfo() {
        System.out.println("id is "+id);

    }
}