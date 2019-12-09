package singletonPattern;

public class CardCompanyTest {

	public static void main(String[] args) {
		CardCompany company=CardCompany.getInstance();
		
		Card myCard1=company.createCard();
		Card myCard2=company.createCard();
		
		System.out.println(myCard1.getCardNumber());
		System.out.println(myCard2.getCardNumber());
	}

}
