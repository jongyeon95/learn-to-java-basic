package abstractCar;

public abstract class Car {
	public void start() {
		System.out.println("시동을 겁니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public abstract void stop();
	public abstract void dirve();
	
	public final void run() {
		start();
		dirve();
		stop();
		turnOff();
	}

}
