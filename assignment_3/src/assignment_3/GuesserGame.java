package assignment_3;
import java.util.*;

/* Improvements made
 * 1) Added a restrcition to enter numbers only between 1 to 10
 * 2) Added a modification to display player numbers while entering the guess
 * 3) Added a message/warning if any number is entered than the prescribed range
 * 4) Guesser has given a chance to enter again a new number if he/she does not enter with in the range
 * 5) Added the logic to eliminate the player who guesses the number out of range
 * 6) Added validations to show the eliminated players at the end as well*/
class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number");
		System.out.println("Note : Number should be in the range of 1 to 10");
		guessNum=scan.nextInt();
		if(guessNum>=1 && guessNum <=10)
		{
		return guessNum;
		}
		else 
		{
		System.out.println("Number is out of range. Please try again");	
		return guessNum();
		}
	
	}	
}

class Player
{
	int guessNum;
	
	int guessNum(int m)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player "+m+ " kindly guess the number");
		System.out.println("Note : Number should be in the range of 1 to 10.");
		System.out.println("If number is out of the range, player will be eliminated from the game");
		guessNum=scan.nextInt();
		if(guessNum>=1&& guessNum<=10)
		{
		return guessNum;
		}
		else
		{
		System.out.println("Number out of the range...!! Player "+m+" eliminated");
		return 0;
		}
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		int i=1;
		int j=2;
		int k=3;
		numFromPlayer1=p1.guessNum(i);
		numFromPlayer2=p2.guessNum(j);
		numFromPlayer3=p3.guessNum(k);
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
		
		if(numFromPlayer1==0)
		{
			if(numFromPlayer2==0 && numFromPlayer3==0)
			{
				System.out.println("All 3 players eliminated due to their guess out of the range mentioned...!!");
			}
			else if(numFromPlayer2==0) 
			{
				System.out.println("players 1 and 2 eliminated due to their guess out of the range mentioned...!!");
			}
			else if(numFromPlayer3==0) 
			{
				System.out.println("players 1 and 3 eliminated due to their guess out of the range mentioned...!!");
			}
			else
			{
				System.out.println("player 1 eliminated due to guess out of the range mentioned...!!");
			}
		}
		
		else if(numFromPlayer2 ==0) 
		{
			if(numFromPlayer3==0) 
			{
				System.out.println("player 2 and 3 eliminated due to their guess out of the range mentioned...!!");
			}
			else
			{
				System.out.println("player 2 eliminated due to  guess out of the range mentioned...!!");
			}
		}
		else if (numFromPlayer3==0)
		{
			System.out.println("player 3 eliminated due to guess out of the range mentioned...!!");
		}
		
		
		
	}
	
}


public class GuesserGame {

	public static void main(String[] args) {
		
			Umpire u=new Umpire();
			u.collectNumFromGuesser();
			u.collectNumFromPlayers();
			u.compare();

	}

}