/**
 * Created by kravchuk on 08.07.2017.
 */
public class Pet {
    int age;
    float weight;
    float height;
    String color;

    public void sleep(){
        System.out.println("Спокойной ночи! До завтра!");
    }

    public void eat(){
        System.out.println("Я очень голоден. Давайте перекусим чипсами?");
    }
    public String say(String aWord){
        String petResponse = "Ну ладно!! "+aWord;
        return petResponse;
    }

}
