package improveFor;

public class Book {
	private String name;
	private String author;
	
	Book(String n, String a){
		name=n;
		author=a;
	}
	
	void ShowInfo() {
		System.out.println("����: "+name+"\n �۰�: "+author);
	}
	
}
