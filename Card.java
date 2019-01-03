
public class Card implements Comparable {

	private String rank  ;
	private int rankint ; // integer for rank 
	private String suit ;
	
	
	
	public String getRank() {
		return rank; 
	}
	
	public int getRankInt() {
		return rankint ; 
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
