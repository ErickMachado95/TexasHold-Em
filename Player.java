import java.util.ArrayList;

public class Player {
	
	private String name ; 
	private ArrayList<Card> hand ; 
	private int pokerChips ; 
	
	
	
	public Player(String name, int pokerChips) {
		
		this.name = name ; 
		hand = new ArrayList<Card>() ; 
		this.pokerChips = pokerChips ; 
	}
	
	public String getName() {
		return name ; 
	}
	
	public void addCardToHand() {
		
	}
	
	public ArrayList<Card> getHand(){
		return hand ; 
	}
	
	public void discardHand() {
		
		hand.removeAll(hand) ; 
	}
	
	public void addPokerChips(int amount) {
		pokerChips += amount ; 
	}
	
	public void removePokerChips(int amount) {
		pokerChips -= amount ; 
	}
	
	
	
	

}
