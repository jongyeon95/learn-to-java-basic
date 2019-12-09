package improveFor;

public class Book {
	private String name;
	private String author;
	
	Book(String n, String a){
		name=n;
		author=a;
	}
	
	void ShowInfo() {
		System.out.println("제목: "+name+"\n 작가: "+author);
	}
	
}
