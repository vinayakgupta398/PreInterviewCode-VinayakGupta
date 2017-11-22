package deck;

import static org.junit.Assert.assertTrue;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestDeckofCards {
	//To check if the count of the deck is 52 or not as one ideal deck of cards contains 52 cards.
	@Test
	public void checkCountOfCards()
	{
		boolean checkingCount; 
		if(new DeckofCards().numberOfCards()==52)
			checkingCount=true;
		else
			checkingCount=false;
		assertTrue("The Size of the deck is 52", checkingCount);
	}
	//To check the deck of cards contain every single card and no repetition of cards. 
	/**
	 * 
	 */
	@Test
	public void checkFacesAndSuitOfCards()
	{
		//Using HashMap can ensure that every card is taken once as the key in the Hash Map is unique.
		HashMap<String,Integer> mp = new HashMap<String,Integer>();
		HashMap<String,Integer> mpDuplicateCards = new HashMap<String,Integer>();
		Card[] validatingDeck=new DeckofCards().setOfCardsInDeck();
			
		//System.out.println(validatingDeck[1].toString());
		for(int i=0;i<validatingDeck.length;i++)
			{
				
				if(mp.get(validatingDeck[i].toString())== null )
					mp.put(validatingDeck[i].toString(),1);
				else
					mpDuplicateCards.put(validatingDeck[i].toString(),1);
				
			}
		
		assertTrue("The Deck Has all Unique Values" ,(mp.size()==52 && mpDuplicateCards.isEmpty()));
			
	}
}
