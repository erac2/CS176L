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

		System.out.println(game.getPairs(hand));
	} //Rest of code: See sample output in lab doc.
}
