package improveFor;

public class ImproveForTest {

	public static void main(String[] args) {
		Book[] comicBook= new Book[5];
		Book[] poemBook=new Book[4];
		comicBook[0]=new Book("���۸�","DC");
		comicBook[1]=new Book("��Ʈ��","DC");
		comicBook[2]=new Book("��ũ","MARVEL");
		comicBook[3]=new Book("���̾��","MARVEL");
		comicBook[4]=new Book("��Ű���콺","DISNEY");
		poemBook[0]=new Book("�� ��� ��", "������");
		poemBook[1]=new Book("����", "������");
		poemBook[2]=new Book("û���", "�ڸ��");
		poemBook[3]=new Book("����", "�ڸ��");
		
		for(Book book: comicBook)
			book.ShowInfo();
		for(Book book: poemBook)
			book.ShowInfo();
		
	

	}

}