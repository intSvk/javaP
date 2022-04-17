package Interfaces;

public class CarService {

	public void drive() {
		
//		with normal methods :
		
//		BMW bmw = new BMW();
//		Porche porche = new Porche();
//		
//		bmw.drive();
//		porche.drive();
		
		
//		With Interface :
		
		Car[] cars = {new BMW(), new Porche()};
		for (Car car:cars) {
			car.drive();
		}
		
	}
}
