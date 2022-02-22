package rps;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//User is asked to enter numbers between 1 to 3. Computer then generates the numbers between 1 -3.
//The numbers symbolizes following:
//1 - Rock
//2 - Paper
//3 - Scissors
//The user can end the game by pressing number 0.

//The Game`s rules:
//	Rock wins against scissors.
//	Scissors win against paper.
//	Paper wins against rock.

// The winner of the game is displayed at the end of each game.

public class RPSMain {

	// declaring variables
	int rock;
	int paper;
	int scissors;

	// Initializing variables in Constructor
	public RPSMain() {
		this.rock = 1;
		this.paper = 2;
		this.scissors = 3;
	}

	public static void main(String[] args) {

		// Declaring objects
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int user = 0;

		do {
			try {
				// User input
				System.out.println("Enter 1 for ROCK, 2 for PAPER or 3 for SCISSORS. (Press 0 to end the game)");
				user = scan.nextInt();

				// Computer generated input
				int computer = rand.nextInt(4);

				// Output
				if (user == 1 && computer == 3) {
					System.out.println("You chose rock, computer chose scissors. You won!");
				} else if (user == 2 && computer == 3) {
					System.out.println("You chose paper, computer chose scissors. You lost!");
				} else if (user == 1 && computer == 2) {
					System.out.println("You chose rock, computer chose paper. You lost!");
				} else if (computer == 1 && user == 2) {
					System.out.println("You chose paper, computer chose rock. You won!");
				} else if (computer == 1 && user == 3) {
					System.out.println("You chose scissors, computer chose rock. You lost!");
				} else if (computer == 2 && user == 3) {
					System.out.println("You chose scissors, computer chose paper. You won!");
				} else if (user == 1 && computer == 1 || user == 2 && user == 2 || user == 3 && computer == 3) {
					System.out.println("You chose the same numbers. Its a draw!");
				}
				else if(user == 0) {
					System.out.println("The game ended. Thank you for playing!");
				}
			} catch (InputMismatchException e) {
				System.out.println("Wrong input, please try again!");

			}
		} while (user != 0);

	}

}
