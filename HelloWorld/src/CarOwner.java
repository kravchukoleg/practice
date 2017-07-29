/**
 * Created by kravchuk on 08.07.2017.
 */
public class CarOwner {

    public static void main(String[] args){

        Car myCar = new Car();

        myCar.start();

        if (myCar.isInMove()) System.out.println("Поехала!");

        int distance = myCar.drive(30);

        System.out.println("Проехала "+distance+" метров");

        myCar.stop();

        if (!myCar.isInMove()) System.out.println("Остановилась!");

        System.out.println("Угоним машину Джеймса Бонда");

        Car myCarJames = new JamesBondCar();

        myCarJames.start();

        if (myCarJames.isInMove()) System.out.println("Поехала!");

        distance = myCarJames.drive(30);

        System.out.println("Проехала "+distance+" метров");

        myCarJames.stop();

        if (!myCarJames.isInMove()) System.out.println("Остановилась!");
    }
}
