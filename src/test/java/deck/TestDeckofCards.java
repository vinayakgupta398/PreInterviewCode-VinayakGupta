package deck;

import static org.junit.Assert.assertTrue;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestDeckofCards {
	
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
	@Test
	public void checkFacesAndSuitOfCards()
	{
		//One method can be
		// We can use map<key,list<>> where
		// key would be (spades/clubs/diamonds/hearts) and 
		// the list would be having face of the card i.e. Ace,Deuce,Three,Four,Five,Six,Seven,Eight,Nine,Ten,Jack,Queen,King
		//this could be done in order to check if every suit has all the face card been formed, for this we need to break the string.
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
