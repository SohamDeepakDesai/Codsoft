import java.util.Random;
import java.util.*;

class NumGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int guess;
		
        while(true){
			int numberToGuess = rand.nextInt(100) + 1;
			int totalAttemp=1;  
        System.out.println("Welcome to the number Guessing game.....!");
      
        while (true) {
			System.out.println("Guess a number between 1 and 100:");
            guess = sc.nextInt(); 
                if (guess == numberToGuess) {
                System.out.println("Congratulations, you guessed the right number! and no of attempts required are : "+ totalAttemp);
                break;
            }
            else if(totalAttemp == 8){
                System.out.println("----- Sorry you are Out of attempts ...!-----");
                break;
            }
               else if (guess < numberToGuess) {
                System.out.println("Your guess is too low.Try again:");
                totalAttemp ++;
            } 
               else{
                System.out.println("Your guess is too high.Try again:");
                totalAttemp++;
            }
    }
		System.out.println("Do you want to play again (Y/N) ?");
		String tryagain = sc.next();
		if(!tryagain.equalsIgnoreCase("Y"))
		{
			break;
		}                   
	}
    }
}