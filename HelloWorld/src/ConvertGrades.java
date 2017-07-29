/**
 * Created by kravchuk on 24.07.2017.
 */
public class ConvertGrades {
    static char converGrades(int testResult){

        char grade;

        if(testResult >= 90){
            grade = 'A';
        }else if(testResult>=80&&testResult<90){
            grade = 'B';
        }else if (testResult>=70&&testResult<80){
            grade = 'C';
        }else{
            grade = 'D';
        }
        return grade;
    }
}

