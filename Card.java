
public class Card implements Comparable {

	private int rank  ;
	private String suit ;
	
	public static void main(String[] args) {
		
		Deck ndeck = new Deck() ; 
		
		System.out.println(ndeck.getDeck()) ; 
		
		ndeck.shuffleDeck();
		
		System.out.println(ndeck.getDeck()) ; 
		
		
	}
	
	@Override
	public String toString() {
		
		switch(rank) {
		case 1 : return 'A' + " "  + suit ; 
		case 11 : return 'J' + " " + suit ; 
		case 12 : return 'Q' + " " + suit ; 
		case 13 : return 'K' + " " + suit ; 
		default : return Integer.toString(rank) + " " + suit ; 
			
			
		}
		
		
	}
	
	public Card(int rank, String suit) {
		this.rank = rank; 
		this.suit = suit ; 
		
	}
	
	
	public int getRank() {
		return rank; 
	}
	
	
	public String getSuit() {
		return suit ;
	}
	
	public void swap(Card o) {
		
		
	}
	
	
	public boolean compareSuit(Card o ) {
		
		return suit.equals(o.getSuit()) ; 
	}
	
	@Override
	public int compareTo(Object arg0) {
		try { 
			Card othercard = (Card)arg0 ; 
			
			
		}
		
		catch(Exception e){ 
			
			throw new IllegalArgumentException() ; 
		}
		return 0;
	} 
	
}
