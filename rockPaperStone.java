package rockPaperStone;

import java.util.Random;
import java.util.Scanner;

public class rockPaperStone {

	public static void main(String[] args) {
		System.out.println("Choose one ");
		System.out.println("ROCK" );
		System.out.println("PAPER" );
		System.out.println("SCISSORS" );
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		String computerChoice ;
		String userChoice ;
		String winner ;
		
		computerChoice = generatorComputerChoice (random);
		userChoice = getUserChoice (scanner);
		winner = chooseWinner (computerChoice , userChoice);
		System.out.println("Your choice " + userChoice );
		System.out.println("Computer Choice " +computerChoice);
		System.out.println(winner);
		
		
	}
	public static String getUserChoice (Scanner scanner) {
		String userWordchoice ; 
		System.out.println("User, Please make a choice: ");
		userWordchoice = scanner.nextLine();
		return userWordchoice ;
		
	}
	
	public static String generatorComputerChoice (Random random) {
	
		int wordNumber = random.nextInt(3);
		String computerWordChoice = "";
		if (wordNumber == 1 ) {
			computerWordChoice = "ROCK";
		}
			else if (wordNumber == 2) {
				computerWordChoice = "PAPER";
			}
			
			else if (wordNumber == 3) {
				computerWordChoice = "SCISSORS";
			}
		System.out.println("The computer choice is made: ");
		return computerWordChoice ;
		
			
		}
	
		public static String chooseWinner (String computerChoice, String userChoice) {
		String winner = "No winner";
		String finalMessage ;
		
		if (computerChoice.equals("ROCK") && userChoice.equals("SCISSORS")) {
			winner = "COMPUTER";
			}
			else if (userChoice.equals("ROCK") && computerChoice.equals("SCISSORS")) {
				winner = "YOU";
			}
		
		if (computerChoice.equals("SCISSORS") && userChoice.equals("PAPER")) {
			winner = "COMPUTER";
			}
		else if (userChoice.equals("SCISSORS") &&  computerChoice.equals("PAPER")) {
			winner = "YOU"; 
			}
		if (computerChoice.equals("PAPER") && userChoice.equals("ROCK")) {
			winner = "COMPUTER" ;
			}
		else if (userChoice.equals("PAPER") && computerChoice.equals("ROCK")) {
			winner = "YOU" ;
			}
		finalMessage = winner ;
		return finalMessage ;
		
		
		
	}
	}

