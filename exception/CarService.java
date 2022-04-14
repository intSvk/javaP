package exception;

public class CarService {

    public void process(String input){
        CarState carstate = CarState.from(input);
    }

}