/**
 * Created by kravchuk on 08.07.2017.
 */
public class PetMaster {
    public static void main(String[] arg){
        String petReaction;
        Pet myPet = new Pet();
        myPet.eat();
        petReaction = myPet.say("Чик!! Чирик!!");
        System.out.println(petReaction);
        myPet.sleep();

        Fish myLitleFish = new Fish(3);
        myLitleFish.sleep();
    }
}
