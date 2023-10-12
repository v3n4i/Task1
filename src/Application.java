public class Application {
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

    }}
