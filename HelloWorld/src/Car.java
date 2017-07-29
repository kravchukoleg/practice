/**
 * Created by kravchuk on 08.07.2017.
 */
public class Car {

    private boolean inMove;

    public void start(){
        inMove = true;
    }
    public void stop(){
        inMove = false;
    }
    public boolean isInMove(){
        return inMove;
    }

    public int drive(int howlong){
        int distance = howlong*60;
        return distance;
    }

}
