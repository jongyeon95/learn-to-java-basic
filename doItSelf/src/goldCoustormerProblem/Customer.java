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
		System.out.println("°í°´ ID: "+customerId+"\n °í°´¸í: "+customerName+"\n °í°´µî±Þ: "+Grade+"\n º¸À¯Æ÷ÀÎÆ®: "+bonusPoint+"\n Áö°©:"+wallet);
	}
	
	void Calpay(int pay) {
		bonusPoint+=pay*bonusRatio;
		wallet-=pay;
	}
	

}
