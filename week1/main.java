import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Enter a number: ");
        int i = scanner.nextInt();
        if (prime(i)) {
            System.err.println("The number is prime");
        }
        else {
            System.err.println("The number is not prime");
        }

    }
    public static Boolean prime (int i){
        for (int d = 2; d < i; d ++){
            if (i%d == 0) return false;
        } return true;
    } 
}