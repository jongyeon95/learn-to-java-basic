package goldCoustormerProblem;

public class GoldCustomer extends Customer {
private double paySale;
	
	GoldCustomer(int id, String name){
		super(id,name);
		paySale=0.10;
		Grade="Gold";
		bonusPoint=5000;
		bonusRatio=0.02;
	}
	
	void Calpay(int pay) {
		pay=pay-(int)(pay*paySale);
		bonusPoint+=pay*bonusRatio;
		wallet-=pay;
	}

}
