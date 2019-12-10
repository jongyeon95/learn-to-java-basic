package abstractCar;

public abstract class Car {
	public void start() {
		System.out.println("�õ��� �̴ϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
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
