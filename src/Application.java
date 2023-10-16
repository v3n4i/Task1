
import java.util.Scanner;
public class Application {
    String[] Animal;
    public static void main(String[] args) {

        Animal h1 = new Animal("Бобик", 15, 15, "черный");
        System.out.println(h1);
        Cat cat1 = new Cat("cat", 1,1,"black");
        cat1.Say();
        Dog dog = new Dog("Собака", 1,1,"коричневый");
        dog.Say();
        Duck duck1 = new Duck("Утка",1, 1, "белый");
        duck1.Fly();
        duck1.Say();
        System.out.println("Введите команду из списка add/list/exit");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if (str.equals("add"))

        {Commands h2 = Commands.add;
            switch (h2){
                case add:
                    System.out.println("Добавьте животное");
                    break;}
        }  }
}
