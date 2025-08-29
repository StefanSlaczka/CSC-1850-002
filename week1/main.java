import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Enter a number: ");
        int year = scanner.nextInt();
        if (IfLeapYear(year)) {
            System.err.println("True");
        }
        else {
            System.err.println("False");
        }
    }
    public static Boolean IfLeapYear (int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return true;
        }
        else {
            return false;
        }
    }
}