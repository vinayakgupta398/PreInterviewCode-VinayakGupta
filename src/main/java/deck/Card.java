package deck;
//represent a playing card in the deck. 
/**
 * @author vinayak gupta
 *
 */
public class Card {

	private String face; // face of the card.
	private String suit; // suit of the card.
	
	public Card(String cardFace,String cardSuit)
	{
		 face=cardFace;
		 suit=cardSuit;
		
	}
	//Creating the display text on console.
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return face +" of "+ suit;
	}
	
}
