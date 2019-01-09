import java.util.ArrayList;
import java.util.Date;
import java.util.Random; 
public class Deck {
	static int deckSize = 52;
	ArrayList<Card> deckOfCards= new ArrayList<Card>()  ;  
	public Deck() {
		for(int i = 1 ; i <= 13 ; i++) {
			Card ncard = new Card(i,"Spades") ; 
			deckOfCards.add(ncard) ; 
		}
		for(int i = 1 ; i <= 13 ; i++) {
			Card ncard = new Card(i,"Clubs") ; 
			deckOfCards.add(ncard) ; 
		}
		for(int i = 1 ; i <= 13 ; i++) {
			Card ncard = new Card(i,"Hearts") ; 
			deckOfCards.add(ncard) ; 
		}
		for(int i = 1 ; i <= 13 ; i++) {
			Card ncard = new Card(i,"Diamonds") ; 
			deckOfCards.add(ncard) ; 
		}
	}
	
	public ArrayList<Card> getDeck(){
		return deckOfCards ;
	}
	public void shuffleDeck() {
		Date date = new Date() ; 
		Random  rand = new Random(date.getTime()) ; 
		
		for(int i = 0 ; i < 52 ; i++) {
		swapCards(i,rand.nextInt(52)) ;  
		}
	}
	
	public void swapCards(int index1 , int index2) {
		
		Card card1 = deckOfCards.get(index1) ; 
		Card card2 = deckOfCards.get(index2) ;  
		deckOfCards.set(index1,card2) ; 
		deckOfCards.set(index2,card1) ; 
		
	}
	
	
}
