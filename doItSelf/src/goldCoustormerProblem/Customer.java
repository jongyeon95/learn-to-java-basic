package goldCoustormerProblem;

public class Customer {
	private int customerId;
	private String customerName;
	protected String Grade;
	protected int bonusPoint;
	protected double bonusRatio;
	protected int wallet;
	
	public Customer(int id,String name){
		customerId=id;
		customerName=name;
		Grade="Silver";
		bonusPoint=1000;
		bonusRatio=0.01;
		wallet=100000;
	}
	
	void ShowCustomerInfo() {
		System.out.println("�� ID: "+customerId+"\n ����: "+customerName+"\n �����: "+Grade+"\n ��������Ʈ: "+bonusPoint+"\n ����:"+wallet);
	}
	
	void Calpay(int pay) {
		bonusPoint+=pay*bonusRatio;
		wallet-=pay;
	}
	

}
