class Card{
	String kind;
	int number;
	
	
	int width = 30;
	int height = 40;
	
}
public class Cooooo{
	public static void main(String[] args) {
		
		Card card1 = new Card();
		card1.kind = "구땡";
		card1.number = 9;
		
		Card card2 = new Card();
		card2.kind = "팔땡";
		card2.number = 8;
		
		System.out.println("card1.kind는 "+card1.kind+"이고 card1.number는 "+card1.number);
		System.out.println("card2.kind는 "+card2.kind+"이고 card2.number는 "+card2.number);
		
		card1.width = 60;
		card1.height = 80;
		System.out.println("card1.width는 "+card1.width+"이고 card1.height는 "+card1.height);
		System.out.println("card2.width는 "+card2.width+"이고 card2.height는 "+card2.height);
		
		
	}
}
	
