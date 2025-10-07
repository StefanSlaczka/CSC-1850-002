import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter your first number: ");
        double a = scanner.nextInt();

        System.out.println("Please enter your symble: ");
        // did not output for some reson
        String opp = scanner.nextLine();

        System.out.println("Please enter your seconed number: ");
        double b = scanner.nextInt();

        System.out.println("Total: "+ Calc.together(a, opp, b));

        
    }
}