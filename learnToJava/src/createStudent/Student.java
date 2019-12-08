package createStudent;

public class Student {
	public int age;
	public String name;
	
	Student(int a, String b){
		age=a;
		name=b;
	}
	
	public void ShowStudentInfo() {
		System.out.println("이름 :"+name+" 나이 :"+age);
	}
	
	public String getStudentName() {
		return name;
	}

}
