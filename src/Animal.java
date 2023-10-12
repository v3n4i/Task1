public class Animal {

    String name;
    int age;
    int weight;
    String color;
    String goda;
    public void Say()
    {
        System.out.println("Я говорю");

    }
    public String Go (){
        return "Я иду";
    }
    public String Drink(){
        return "Я пью";
    }
    public String Eat(){
        return "Я ем";
    }
    public Animal (String name, int age, int weight, String color){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color=color;
    }


    public String toString (){
        return "Привет! меня зовут "+name+", мне "+age+" "+goda()+". Я вешу - "+weight+" кг, мой цвет - "+color;}


    public String goda (){
        String i = "лет";
        if (age ==1){
            i = "год";}
        if (age==2||age==3||age==4){
            i = "года";
        } {
            i = "лет";}

        return i;
    }
}
