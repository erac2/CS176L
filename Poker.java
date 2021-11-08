package lab7.poker;

/**
 * Your name:
 *
 * Poker.java: Contains a deck of PlayingCards and methods to play basic poker
 *
 */

public class Poker extends CardGame
{

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
		int i = 0;
		int check = 0;
		/*for (i=0; i>5; i++)
		{
			System.out.println(hand[i]);
		}*/
		
		for(i = 0; i>5; i++)
		{
			if(hand[i].getValue() == hand[check].getValue())
			{
				check++;
			}
		if (check == 1)
		{
			return 1;
		}
	
	///	return check;
		}
	
		return check; // dummy val		
	} // end getPair()



	/**
	 * Detect Three of a kind. 
	 * @param hand of 5 PlayingCards
	 * @return three of a kind, true or false 
	 */
	public boolean hasThreeOfAKind(PlayingCard [] hand)
	{    	

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

