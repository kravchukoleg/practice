import com.sun.xml.internal.bind.v2.TODO;

/**
 * Created by kravchuk on 08.07.2017.
 */
public class FishMaster {
    public static void main(String[] args){
        String petReaction;
        Fish myFish = new Fish(2);
        myFish.dive(200);
        myFish.dive(3);
        petReaction = myFish.say("Привет!");
        System.out.println(petReaction);
        myFish.sleep();

    }
}
