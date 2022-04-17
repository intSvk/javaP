package exceptionHandle;

public enum CarState {
	DRIVING, WAITING, PARKING;

//	No need for the direct valuesOf method
	
//    public static CarState from(String state) {
//        switch (state) {
//            case "DRIVING":
//                return DRIVING;
//            case "WAITING":
//                return WAITING;
//            case "PARKING":
//                return PARKING;
//            default:
//                throw new RuntimeException("UNKNOWN STATE : " + state);
//        }
//    }
}
