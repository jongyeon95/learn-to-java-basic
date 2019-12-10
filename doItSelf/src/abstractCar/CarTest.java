package abstractCar;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		ArrayList<Car> list=new ArrayList<Car>();
		list.add(new Avante());
		list.add(new BMW());
		list.add(new Sonata());
		list.add(new Avante());
		
		for(Car car: list) {
			car.run();
		}
		

	}

}
