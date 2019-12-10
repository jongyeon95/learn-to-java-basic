package abstractCar;

public class Avante extends Car {
	@Override
	public void stop() {
		System.out.println("아반때 멈춥니다.");
	}

	@Override
	public void dirve() {
		System.out.println("아반때 달립니다.");
		
	}
}
