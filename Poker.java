package lab7.poker;
import java.util.Arrays;

/**
 * Your name:
 *
 * Poker.java: Contains a deck of PlayingCards and methods to play basic poker
 *
 */

public class Poker extends CardGame
{

	private int pair;
	// Constructor(s):	
	public Poker()
	{
		super(true); // Calls CardGame constructor with shuffle=true
	} // end constructor



	// Methods:


	// Methods to detect hand ranks:

	/*
	 * Return the number of pairs:
	 * 0 = no pairs, 1 = one pair, 2 = two pairs
	 * @param hand of 5 PlayingCards
	 * @return number of pairs in hand
	 */

	public int getPairs(PlayingCard [] hand)
	{
		int [] handValues = new int[5];

		handValues[0] = hand[0].getValue();
		handValues[1] = hand[1].getValue();
		handValues[2] = hand[2].getValue();
		handValues[3] = hand[3].getValue();
		handValues[4] = hand[4].getValue();

		Arrays.sort(handValues);

		int i;

		if(handValues[0] == handValues[1])
		{
			pair++;
		}
		if(handValues[1] == handValues[2])
		{
			pair++;
		}
		if(handValues[2] == handValues[3])
		{
			pair++;
		}
		if(handValues[3] == handValues[4])
		{
			pair++;
		}

		return pair; // dummy val		
	} // end getPair()



	/**
	 * Detect Three of a kind. 
	 * @param hand of 5 PlayingCards
	 * @return three of a kind, true or false 
	 */
	public boolean hasThreeOfAKind(PlayingCard [] hand)
	{   
		int [] handValues = new int[5];

		handValues[0] = hand[0].getValue();
		handValues[1] = hand[1].getValue();
		handValues[2] = hand[2].getValue();
		handValues[3] = hand[3].getValue();
		handValues[4] = hand[4].getValue();

		Arrays.sort(handValues);

		if(handValues[0] == handValues[1] && handValues[1] == handValues[2])
		{
			return true;
		}
		if(handValues[1] == handValues[2] && handValues[2] == handValues[3])
		{
			return true;
		}
		if(handValues[2] == handValues[3] && handValues[3] == handValues[4])
		{
			return true;
		}
		
		return false; // dummy val
	} // end hasThreeOfAKind




	/**
	 * Detect Full House
	 */
	public boolean hasFullHouse(PlayingCard [] hand)
	{

		return false; // dummy val		
	} // end hasFullHouse




	/**
	 * Detect Four of a Kind.
	 */
	public boolean hasFourOfAKind(PlayingCard [] hand)
	{    	

		return false; // dummy val		
	} // end hasFourOfAKind	



	/**
	 * Detect Flush.
	 */
	public boolean hasFlush(PlayingCard [] hand)
	{    		

		return false; // dummy val		
	} // end hasFlush




	/**
	 * Detect a Straight (INCOMPLETE)
	 */
	public boolean hasStraight(PlayingCard [] hand)
	{

		return false; // dummy val		
	} // end hasStraight



	/**
	 * Detect a Straight Flush
	 */
	public boolean hasStraightFlush(PlayingCard [] hand)
	{

		return false; // dummy val		
	} // end hasStraightFlush



	/**
	 * Detect a Royal Flush
	 */
	public boolean hasRoyalFlush(PlayingCard [] hand)
	{

		return false; // dummy val		
	} // end hasRoyalFlush


} // end class
