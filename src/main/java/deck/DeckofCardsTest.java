package deck;

/**
 * @author vinayak gupta
 *
 */
public class DeckofCardsTest {

	public static void main(String[] args)
	{
		DeckofCards myDeckofCards=new DeckofCards();
		myDeckofCards.shuffle();//palcing cards in random order.
		//print 52 cards in the order they are dealt.
		for(int i=0;i<13;i++)
		{
			//deal and print 4 cards
			System.out.printf("%-20s%-20s%-20s%-20s\n",
					myDeckofCards.dealCard(),myDeckofCards.dealCard(),myDeckofCards.dealCard(),myDeckofCards.dealCard());
			
		}
		
	}
}
