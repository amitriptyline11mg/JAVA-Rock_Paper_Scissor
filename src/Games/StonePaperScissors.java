package Games;

import java.util.Random;
import java.util.Scanner;

public class StonePaperScissors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			// Rock = r, paper = p, scissors = s
			String[] rps = { "r", "p", "s" }; // Created a list & stored it inside the array of string type
			String computerMove = rps[new Random().nextInt(rps.length)]; // This random class will choose a number
																			// between 0-2
			System.out.println("\nComputer chose: " + computerMove);

			String userMove;

			while (true) {
				System.out.print("Enter your move below (r, p, s):");
				userMove = sc.nextLine().toLowerCase();

				if (userMove.equals("r") || userMove.equals("p") || userMove.equals("s")) {
					break;
				}
				System.out.println("Please enter a valid option\n");
			}

			if (computerMove.equalsIgnoreCase(userMove)) {
				System.out.println("The game is Tied!");

			} else if (userMove.equalsIgnoreCase("r")) {
				if (computerMove.equals("p")) {
					System.out.println("Computer chose Paper: YOHOO, You Lose!!");

				} else if (computerMove.equals("s")) {
					System.out.println("Computer chose Scissor: YOHOO, You WON!!");
				}
			} else if (userMove.equalsIgnoreCase("p")) {
				if (computerMove.equals("s")) {
					System.out.println("Computer chose Scissor: YOHOO, You Lose!!");

				} else if (computerMove.equals("r")) {
					System.out.println("Computer chose Rock: YOHOO, You WON!!");
				}
			} else if (userMove.equalsIgnoreCase("s")) {
				if (computerMove.equals("r")) {
					System.out.println("Computer chose Rock: YOHOO, You Lose!!");

				} else if (computerMove.equals("p")) {
					System.out.println("Computer chose Paper: YOHOO, You WON!!");
				}
			}

			System.out.println("Play again? (y/n)");
			String playAgain = sc.nextLine();

			if (!playAgain.equals("y")) {
				break;
			}
			
			sc.close();

		}

	}

}
