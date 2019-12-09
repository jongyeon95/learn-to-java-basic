package date;



public class Date {
	private int year;
	private int month;
	private int day;
	private boolean IsValid;

	Date(int y, int m, int d) {
		year=y;
		month=m;
		day=d;
		IsValid = true;
		operation();
	}

	public void operation() {

		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			if (day < 1 || day > 31)
				IsValid = false;
			break;
		case 4:case 6:case 9:case 11:
			if (day < 1 || day > 30)
				IsValid = false;
			break;
		case 2:
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						if (day < 1 || day > 29)
							IsValid = false;
					} else {
						if (day < 1 || day > 28)
							IsValid = false;
					}

				} else {
					if (day < 1 || day > 29)
						IsValid = false;
				}
			} else {
				if (day < 1 || day > 28)
					IsValid = false;
			}
			break;
		default:
			IsValid=false;
			break;
		}
	}
	void ShowDateVaild() {
		if(IsValid)
			System.out.println("날짜가 유효 합니다.");
		else
			System.out.println("날짜가 유효하지 않습니다.");
	}
	

}


