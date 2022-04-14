package exception;

public class CarSelector {
    public static void main(String[] args) {
        CarService carservice = new CarService();
        for (String argument : args) {
            try {
                carservice.process(argument);
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
