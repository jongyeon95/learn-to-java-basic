package createStudent;

public class Student {
	public int age;
	public String name;
	
	Student(int a, String b){
		age=a;
		name=b;
	}
	
	public void ShowStudentInfo() {
		System.out.println("�̸� :"+name+" ���� :"+age);
	}
	
	public String getStudentName() {
		return name;
	}

}
