package singletonPattern;

public class Card {
	private static int CardId=10000;
	private int CardNum;
	
	Card(){
		CardNum=CardId;
		CardId++;
	}
	
	int getCardNumber() {
		return CardNum;
	}
	
}
