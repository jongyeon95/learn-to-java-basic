package date;

public class Main {

	public static void main(String[] args) {
		Date date1=new Date(2019,2,29);
		Date date2=new Date(2019,2,28);
		Date date3=new Date(2019,21,29);
		Date date4=new Date(2020,2,29);
		Date date5=new Date(2100,2,29);
		
		date1.ShowDateVaild();
		date2.ShowDateVaild();
		date3.ShowDateVaild();
		date4.ShowDateVaild();
		date5.ShowDateVaild();

	}

}
