package lamdaCustomer;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
	Customer customerLee=new Customer("�̼���",40,100);
	Customer customerPark=new Customer("�����ż�",80,200);
	Customer customerChoi=new Customer("��������",25,150);

	List<Customer> tlist=new ArrayList<Customer>();
	tlist.add(customerLee);
	tlist.add(customerPark);
	tlist.add(customerChoi);
	
	System.out.println(tlist);
	tlist.stream().map(c->c.getName()).forEach(s->System.out.println(s));
	int total= tlist.stream().mapToInt(c->c.getCost()).sum();
	System.out.println(total);
	tlist.stream().map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	
	}

}
