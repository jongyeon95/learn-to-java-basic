package arrayList;

public class StudentTest {

	public static void main(String[] args) {
		Student student1=new Student(1001,"������");
		Student student2=new Student(1002,"�̿���");
		Student student3=new Student(1003,"��ο�");
		Book book1=new Book("��Ʈ��","DC");
		Book book2=new Book("�¹���1","������");
		Book book3=new Book("�¹���2","������");
		Book book4=new Book("�¹���3","������");
		Book book5=new Book("�¹���4","������");
		student1.addBook(book1);
		student1.addBook(book2);
		student1.addBook(book3);
		student2.addBook(book3);
		student2.addBook(book4);
		student3.addBook(book1);
		student3.addBook(book3);
		student3.addBook(book5);
		
		student1.ShowStudentInfo();
		student2.ShowStudentInfo();
		student3.ShowStudentInfo();
		
		

	}

}