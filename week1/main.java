import java.util.Random;
import java.util.Scanner;

public class main {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomNum = random.nextInt(100) + 1;
		
		int guess = 0;
		
		while (guess != randomNum) {
			System.out.println("Please guess a number between 1 to 100");
			guess = scanner.nextInt();
			
			if (guess > randomNum){
				System.out.println("Your number is too high.");
			} else { System.out.println("Your number is too low");}
		}System.out.println("You Won");
	}
}