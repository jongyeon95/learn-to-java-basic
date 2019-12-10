package goldCoustormerProblem;

public class VipCustomer extends Customer {
	private double paySale;
	
	VipCustomer(int id, String name){
		super(id,name);
		paySale=0.15;
		Grade="VIP";
		bonusPoint=10000;
		bonusRatio=0.05;
	}
	
	void Calpay(int pay) {
		pay=pay-(int)(pay*paySale);
		bonusPoint+=pay*bonusRatio;
		wallet-=pay;
	}

}
