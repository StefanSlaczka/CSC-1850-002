import java.util.Scanner;

public class main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount of number you want to see FizzBuzz");
		int number = scanner.nextInt();
		FizzBuzz(number);
	}
	public static void FizzBuzz(int number){
		for (int i = 0; i <= number; i++){
			if (i % 15 == 0){
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0){
				System.out.println("Buzz");
			}else if (i % 3 == 0){
				System.out.println("Fizz");

			}else { System.out.println(i);}
		}
	}
}