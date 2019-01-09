import java.util.ArrayList;

public class CheckCards {
	
	public static boolean royalFlush(ArrayList<Card> cards) {
		
		String suit = cards.get(0).getSuit() ; 
		
		for(Card c : cards) {
			
			if(!suit.equals(c.getSuit())) { return false ;  }
		}
		
		return false ; 
	}

}
