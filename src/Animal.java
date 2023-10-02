public class Animal {

    private String name;
    private int age;
    private int weight;
    private String color;
    private String goda;
    public String Say(){
        return "Я говорю";
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




    /*  String i = function1();
        if (age==1){
            i="год";}
*/

    public String toString (){
        return "Привет! меня зовут "+name+", мне "+age+" "+goda()+". Я вешу - "+weight+" кг, мой цвет - "+color;}


    public String goda (){
        String i = "лет";
        if (age ==1){
            i = "год";}
        if (age==2){
            i = "года";
        }
        return i;
    }
}
