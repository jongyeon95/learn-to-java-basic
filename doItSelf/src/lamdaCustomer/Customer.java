package lamdaCustomer;

public class Customer {

	private String name;
	private int age;
	private int cost;
	
	
	public Customer(String n, int a, int c ) 
	{
		this.name=n;
		this.age=a;
		this.cost=c;
	}
	
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String toString() {
		return name+" , "+age+" , "+ cost;
	}
	
}
