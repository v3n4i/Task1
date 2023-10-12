//interface Flying;
public class Duck extends Animal implements Flying{
    public Duck(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    public void Fly(){
        System.out.println("я лечу");
    }

    @Override
    public void Say(){
        System.out.println("Кря");
    }

}
