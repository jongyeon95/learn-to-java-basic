package abstractCar;

public class Sonata extends Car {

	@Override
	public void stop() {
		System.out.println("소나타 멈춥니다.");
	}

	@Override
	public void dirve() {
		System.out.println("소나타 달립니다.");
		
	}
	

}
