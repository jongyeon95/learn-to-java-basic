package doItSelf_SingletonPattern;

public class CardCompany {
	private static CardCompany instance = new CardCompany();
	private CardCompany() {}
	public static CardCompany getInstance() {
		return instance;
	}
	public Card createCard() {
		Card mycard=new Card();
		return mycard;
	}
}
