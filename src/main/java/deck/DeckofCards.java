package deck;

import java.util.Random;

/**
 * @author vinayak gupta
 *
 */
public class DeckofCards {
	private Card deck[]; // where the cards of deck gets stored.

	private int currentCard;// The card that the dealer will give to the caller.
	private final int NUMBER_OF_CARDS = 52;// The total number of cards in a deck.
	private Random randomNumber; // to generate random order.
	// Constructor

	public DeckofCards() {
		String faces[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
				"Queen", "King" };
		String suits[] = { "Hearts", "Clubs", "Diamonds", "Spades" };
		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0;
		randomNumber = new Random();
		for (int count = 0; count < deck.length; count++) {
			deck[count] = new Card(faces[count % 13], suits[count / 13]);
		}
	}

	// To pass the cards obtained after shuffling.
	public Card[] setOfCardsInDeck() {
		return deck;
	}

	// The count for the cards in the deck.
	public int numberOfCards() {
		return deck.length;
	}
	// Function for shuffling the card
	public void shuffle() {
		currentCard = 0;
		for (int first = 0; first < deck.length; first++) {
			int second = randomNumber.nextInt(NUMBER_OF_CARDS);
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}

	}
	//dealOneCard is represented as dealCard which is basically dealing the currentCard to the caller.
	public Card dealCard() {
		if (currentCard < deck.length)
			return deck[currentCard++];
		else
			return null;
	}
}
