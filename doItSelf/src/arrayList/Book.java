package arrayList;

public class Book {
	private String name;
	private String author;

	Book(String n, String a) {
		name = n;
		author = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
