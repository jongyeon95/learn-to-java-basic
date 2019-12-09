package arrayList;

import java.util.ArrayList;

public class Student {
	private int studentId;
	private String name;
	private ArrayList<Book> booklist;
	
	Student(int id, String n){
		studentId=id;
		name=n;
		booklist=new ArrayList<Book>();
	}
	
	void addBook(Book book) {
		booklist.add(book);
	}
	
	void ShowStudentInfo() {
		System.out.print(name+"("+studentId+") 학생이 읽은 책은 : ");
		for(int i=0;i<booklist.size();i++) {
			System.out.print(booklist.get(i).getName()+" ");
		}
		System.out.println("입니다.");
	}

}
