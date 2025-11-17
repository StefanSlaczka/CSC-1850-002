import java.util.Scanner;

public class CalculatorWithException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            //inputs / error hadling
            System.out.print("Enter the first number: ");
            double num1 = Double.parseDouble(input.next());

            System.out.print("Enter an operator (+, -, *, /): ");
            char op = input.next().charAt(0);

            System.out.print("Enter the second number: ");
            double num2 = Double.parseDouble(input.next());

            double result = 0;
            // oprations
            switch (op) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num2 != 0 ? num1 / num2 : Double.NaN; break;
                default:
                    System.out.println("Invalid operator.");
                    System.exit(1);
            }
            // Print
            System.out.println("Result: " + result);

        } catch (NumberFormatException ex) {
            System.out.println("Error: One of the operands is not numeric. Program terminated.");
        }

        input.close();
    }
}
