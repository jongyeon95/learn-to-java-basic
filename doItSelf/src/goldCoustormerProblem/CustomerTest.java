package goldCoustormerProblem;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		
		ArrayList<Customer> CustomerList=new ArrayList<Customer>();
		
		CustomerList.add(new VipCustomer(100,"������"));
		CustomerList.add(new GoldCustomer(1000,"�̿���"));
		CustomerList.add(new Customer(10000,"��ο�"));
		
		
		for(Customer list: CustomerList) {
			list.ShowCustomerInfo();
			list.Calpay(10000);
			list.ShowCustomerInfo();
			System.out.println("\n---------------------------\n");
		}
		
		
	
	}

}
