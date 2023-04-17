import java.util.*;

 class Number 
 {
		int systeminput;
		int userinput;
		int noofGuess = 0;

	// It will Generate a Random Number......
	Number() 
	{
		Random random = new Random();
		this.systeminput = random.nextInt(100) + 1;
	}

	// the Following Method Takes a User Gusses....
	public boolean takeuserinput() 
	{
		if ( noofGuess < 10 ) 
		{
			System.out.print("Guess the number : ");
			this.userinput = NumberGame.takeintegerinput(100);
			noofGuess++;
			return false;
		}
		else 
		{
			System.out.println("Attempts Finished Sorry Better Luck Next Time.....\n");
			return true;
		}
	}


	//This Method Check User Input Status.....
	public boolean correctguess() 
	{

		if ( systeminput == userinput ) 
		{
			System.out.println("--------------------------------------------------------------------");
			System.out.println("Congratulations, Its Correct Number " + systeminput + " in " + noofGuess + " guesses");
			System.out.println("--------------------------------------------------------------------");
			switch(noofGuess) 
			{
				case 1:
				System.out.println("---------------------");
				System.out.println(" Marks is 100");
				System.out.println("---------------------");
				break;
				case 2:
				System.out.println("---------------------");
				System.out.println(" Marks is 90");
				System.out.println("---------------------");
				break;
				case 3:
				System.out.println("---------------------");
				System.out.println(" Marks is 80");
				System.out.println("---------------------");
				break;
				case 4:
				System.out.println("---------------------");
				System.out.println(" Marks is 70");
				System.out.println("---------------------");
				break;
				case 5:
				System.out.println("---------------------");
				System.out.println(" Marks is 60");
				System.out.println("---------------------");
				break;
				case 6:
				System.out.println("---------------------");
				System.out.println(" Marks is 50");
				System.out.println("---------------------");
				break;
				case 7:
				System.out.println("---------------------");
				System.out.println(" Marks is 40");
				System.out.println("---------------------");
				break;
				case 8:
				System.out.println("---------------------");
				System.out.println(" Marks is 30");
				System.out.println("---------------------");
				break;
				case 9:
				System.out.println("---------------------");
				System.out.println(" Marks is 20");
				System.out.println("---------------------");
				break;
				case 10:
				System.out.println("---------------------");
				System.out.println(" Marks is 10");
				System.out.println("---------------------");
				break;
			}
			System.out.println();
			return true;
		}
		else if ( noofGuess < 10 && userinput > systeminput ) 
		{
			if ( userinput - systeminput > 10 ) 
			{
				System.out.println("---------------------");
				System.out.println("Too High");
				System.out.println("---------------------");
			}
			else 
			{
				System.out.println("---------------------");
				System.out.println("Little High");
				System.out.println("---------------------");
			}
		}
		else if ( noofGuess < 10 && userinput < systeminput ) 
		{
			if ( systeminput - userinput > 10 ) 
			{
				System.out.println("---------------------");
				System.out.println("To Low Input");
				System.out.println("---------------------");
			}
			else 
			{
				System.out.println("---------------------");
				System.out.println("Little Low Input");
				System.out.println("---------------------");
			}
		}
		return false;
	}
}


public class NumberGame 
{

	public static int takeintegerinput(int limit) 
	{
		int input = 0;
		boolean flag = false;

		while ( !flag ) 
		{
			try 
			{
				Scanner sc = new Scanner(System.in);
				input = sc.nextInt();
				flag = true;

				if ( flag && input > limit || input < 1 ) 
				{
					System.out.println("Choose the number between 1 to " + limit);
					flag = false;
				}
			}
			catch ( Exception e ) 
			{
				System.out.println("Enter only integer value");
				flag = false;
			}
		};
		return input;
	}
	
	public static void main(String[] args) 
	{

		// Following Input to Start a Game.....
		System.out.println("################# Number Gussing Game ########################");
		System.out.println("1. Start the Game \n2. Exit");
		System.out.println("##############################################################");
		System.out.print("Enter your choice : ");
		int choice = takeintegerinput(2);
		int nextRound = 1;
		int noOfRound = 0;

		if ( choice == 1 ) 
		{

			//Check Wheteher Next Round is Present or Not....
			while ( nextRound == 1 ) 
			{
				// Object of Game Class
				Number game = new Number();
				boolean isMatched = false;
				boolean isLimitCross = false;
				System.out.println("############################################");
				System.out.println("\nRound " + ++noOfRound + " starts...");
				System.out.println();
				System.out.println("############################################");
				// check Correct Guess
				while ( !isMatched && !isLimitCross) 
				{
					isLimitCross = game.takeuserinput();
					isMatched = game.correctguess();
				}
				// Check the Input for the Next Round.....
				System.out.println("1. Next Round \n2. Exit");
				System.out.println("Enter The Following Your choice : ");
				nextRound = takeintegerinput(2);
				if ( nextRound != 1 ) 
				{
					System.exit(0);
				}
			}
		}
		else 
		{
			System.exit(0);
		}
	}
}