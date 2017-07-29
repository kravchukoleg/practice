/**
 * Created by kravchuk on 28.07.2017.
 */
public class TemperatureConverter {

    public String convertTemp(int temperature, char convertTo){

        if(convertTo == 'F'){
            temperature = 9*(temperature + 32)/5;
        }else if(convertTo == 'C'){
            temperature = 5*(temperature - 32)/9;
        }

        return Integer.toString(temperature);
    }
}
