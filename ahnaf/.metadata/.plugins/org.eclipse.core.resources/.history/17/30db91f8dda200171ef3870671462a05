import java.util.Scanner;
import java.util.InputMismatchException; 
public class greetUser 
{
	
	public static void main(String[]args)
	{
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("Hello, what is your name?");
		String s = input.next();
		System.out.println("Welcome to the game " + s + ". Please enter your age");
		int x = input.nextInt();
		int numAge = x;
		
		String r = "12";
		Integer.parseInt(r);
				
		if(x > 18)
		{
			System.out.println("Wow your old");
		}
		else
		{
			if(s.equals("Sadman"))
			{
				System.out.println("Wow your old");
			}
			else
			{
				System.out.println("Wow your young");
		*/
		Scanner input = new Scanner(System.in);
		int randomNum = (int)(Math.random()*10+1);
		
		System.out.println("Lets play a guessing game I have generated a random number from 1-10, type any number to begin guessing!");
		int guess = input.nextInt();
		boolean guessed = false;
		while(!guessed)
		{
			if(guess == randomNum)
			{
				System.out.println("You got it!");
				guessed = true;
			}
			else if(guess > randomNum)
			{
				System.out.println("That is too high, try again!");
				guess = input.nextInt();
				
			}
			else
			{
				System.out.println("That is too low, try again!");
				guess = input.nextInt();
			}
		}
		
		
	}
	
}
