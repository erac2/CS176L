package lab7.poker;

public class PlayPoker {
	
	public static void main(String[] args) 
	{
		Poker game = new Poker();
		
		PlayingCard [] hand = new PlayingCard[5];
		
		for (int i = 0; i<5;i++)
		{
			hand[i] = game.draw();
			System.out.println(hand[i]);
		}
		
		int i = 0;
		int check = 0;
		
		
		System.out.println();
		int pair = game.getPairs(hand);
		
		if (pair>1)
		{
			System.out.println("You have " + game.getPairs(hand) + "pairs.");
		}
		else if (pair<=1)
		{
			System.out.println("You have " + game.getPairs(hand) + " pair.");
		}
		else if(game.hasThreeOfAKind(hand) == true)
		{
			System.out.println("You have three of a kind.");
		} 
		
		//Rest of code: See sample output in lab doc.
}
}