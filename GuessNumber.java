import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
	 static Random random  = new Random();
	 static int RandomNumber,RandomNumber1, Guess ,Guess1, Score, Score1;
	 static Scanner scanner = new Scanner(System.in);
	 public static void main(String[] args) {
	 	 
	 	 while(true) {
	 	 	 programm();
	 	 	 player1();
	 	 }
	 }
	 
	 static void programm() {
	 	 
	 	 System.out.print("Player 1, enter a number between 1-10: ");
	 	 Guess = scanner.nextInt();
	 	 RandomNumber = random.nextInt(10)+1;
	 	 if(RandomNumber == Guess) {
	 	 	 Score = Score+1;
	 	 	 System.out.println("Guessed correctly.");
	 	 	 System.out.println("Guessed: " + Guess + " \nRandom number: " + RandomNumber);
	 	 	 System.out.println("Score: " + Score);
	 	 	 System.out.println();
	 	 }else {
	 	 	 System.out.println("Guessed wrong.");
	 	 	 System.out.println("Guessed: " + Guess + " \nRandom number: " + RandomNumber);
	 	 	 System.out.println("Score: " + Score);
	 	 	 System.out.println();
	 	 }
	 	 Score1();
	 }
	 
	 static void player1() {
	 	 System.out.print("Player 2, enter a number between 1-10: ");
	 	 Guess1 = scanner.nextInt();
	 	 RandomNumber1 = random.nextInt(10)+1;
	 	 if(RandomNumber1 == Guess1) {
	 	 	 Score1 = Score1+1;
	 	 	 System.out.println("Guessed correctly.");
	 	 	 System.out.println("Guessed: " + Guess1 + " \nRandom number: " + RandomNumber1);
	 	 	 System.out.println("Score: " + Score1);
	 	 	 System.out.println();
	 	 }else {
	 	 	 System.out.println("Guessed wrong.");
	 	 	 System.out.println("Guessed: " + Guess1 + " \nRandom number: " + RandomNumber1);
	 	 	 System.out.println("Score: " + Score1);
	 	 	 System.out.println();
	 	 }
	 	 Score2();
	 	 
	 }
	 
	 static void Score1() {
	 	 if(Score ==10) {
	 	 	 System.out.println("Player 1 won. You reached the 10 points. Congrats!");
	 	 	 System.exit(0);
	 	 }
	 }
	 
	 static void Score2() {
	 	 if(Score1 ==10) {
	 	 	 System.out.println("Player 2 won. You reached the 10 points. Congrats!");
	 	 	 System.exit(0);
	 	 }
	 }
}