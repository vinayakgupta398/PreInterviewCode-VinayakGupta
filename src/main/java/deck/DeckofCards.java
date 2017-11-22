package deck;

import java.util.Random;

public class DeckofCards {
	 	private Card deck[];
	 	
	 	private int currentCard;
	 	private final int NUMBER_OF_CARDS = 52;
	 	private Random randomNumber;
	 	
	 	public DeckofCards()
	 	{
	 		String faces[]= {"Ace","Deuce","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
	 		String suits[]= {"Hearts","Clubs","Diamonds","Spades"};
	 		deck=new Card[NUMBER_OF_CARDS];
	 		currentCard=0;
	 		randomNumber=new Random();
	 		for(int count=0;count<deck.length;count++)
	 		{
	 			deck[count]=new Card(faces[count%13],suits[count/13]);
	 		}
	 	}
	 	public Card[] setOfCardsInDeck()
	 	{
	 		return deck;
	 	}
	 	public int numberOfCards()
	 	{
	 		return deck.length;
	 	}
	 		
	 		public void shuffle()
	 		{
	 			 	currentCard=0;
	 			 	for(int first=0;first<deck.length;first++)
	 			 	{
	 			 		int second=randomNumber.nextInt(NUMBER_OF_CARDS);
	 			 		Card temp=deck[first];
	 			 		deck[first]=deck[second];
	 			 		deck[second]=temp;
	 			 	}
	 			 		
	 		}
	 		public Card dealCard() {
	 			if(currentCard<deck.length)
	 				return deck[currentCard++];
	 			else
	 				return null;
	 		}
}
	 	
	 	
	 	
	 	
	 	
	 	

