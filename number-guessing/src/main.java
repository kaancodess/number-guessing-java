import java.util.Scanner;
import java.util.Random;
public class main {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		Boolean run = true;
		int remaining_guess = 5;
		System.out.println("number range starting from 0");
		int input_random = scan.nextInt();
		int random_number = random.nextInt(input_random);
		while(run){
		System.out.println("please enter your guess:");
		int guessed_number = scan.nextInt();
		System.out.println("your guessed number is:" + guessed_number);
		if(guessed_number > random_number) {
			System.out.println("your guess is high\n please try another number.");
			remaining_guess--;
			System.out.println("remaining guess:" + remaining_guess);
			if(remaining_guess == 0) {
				System.out.println("you lost.\n" +  "the random number is" + random_number + "your rest rights is: "+ remaining_guess);
				run = false;
			}
		}else if(guessed_number < random_number) {
			System.out.println("your guess is low\nplease try another number.");
			remaining_guess--;
			System.out.println("remaining guess:" + remaining_guess);
			if(remaining_guess == 0) {
				System.out.println("you lost.\n" +  "the random number is" + random_number + "your rest rights is: "+ remaining_guess);
				run = false;
			}
		}else if(guessed_number == random_number) {
			System.out.println("YOU WON! congratulations");
			run = false;
			System.out.println("your guess right before you win: "+remaining_guess);
			}
		}
	}
}
