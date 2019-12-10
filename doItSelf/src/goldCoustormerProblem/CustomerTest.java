package goldCoustormerProblem;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		
		ArrayList<Customer> CustomerList=new ArrayList<Customer>();
		
		CustomerList.add(new VipCustomer(100,"¹ÚÁ¾¿¬"));
		CustomerList.add(new GoldCustomer(1000,"ÀÌ¿ø±Ô"));
		CustomerList.add(new Customer(10000,"±è¹Î¿ì"));
		
		
		for(Customer list: CustomerList) {
			list.ShowCustomerInfo();
			list.Calpay(10000);
			list.ShowCustomerInfo();
			System.out.println("\n---------------------------\n");
		}
		
		
	
	}

}
