package improveFor;

public class ImproveForTest {

	public static void main(String[] args) {
		Book[] comicBook= new Book[5];
		Book[] poemBook=new Book[4];
		comicBook[0]=new Book("슈퍼맨","DC");
		comicBook[1]=new Book("배트맨","DC");
		comicBook[2]=new Book("헐크","MARVEL");
		comicBook[3]=new Book("아이언맨","MARVEL");
		comicBook[4]=new Book("미키마우스","DISNEY");
		poemBook[0]=new Book("별 헤는 밤", "윤동주");
		poemBook[1]=new Book("서시", "윤동주");
		poemBook[2]=new Book("청노루", "박목월");
		poemBook[3]=new Book("나무", "박목월");
		
		for(Book book: comicBook)
			book.ShowInfo();
		for(Book book: poemBook)
			book.ShowInfo();
		
	

	}

}
