package exceptionHandle;

public class CarSelector {
	public static void main(String[] args) {
		CarService carservice = new CarService();

//        System.out.println("Hello");
		// exception handling with switch statement

//        for (String argument : args) {
//        	
////        	System.out.println(argument);
//            try {
//                carservice.process(argument);
//            } catch (RuntimeException e) {
//                System.err.println(e.getMessage());
//            }
//        }

		// exception handling here directly

		for (String argument : args) {
			// System.out.println("hi");
			if (isValid(argument)) {
				carservice.process(argument);
			} else {
				System.err.println("Ignoring the argument : " + argument);
			}
		}
	}

	private static boolean isValid(String argument) {
		try {
			CarState.valueOf(argument);
		} catch (IllegalArgumentException e) {
			return false;
		}
		return true;
	}
}
