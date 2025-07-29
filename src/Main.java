import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number1;
        double number2;
        double result;
        String operator;
        String answer;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Simple Calculator!");
        do {

            System.out.println("Which type of calculation would you like to perform?");
            System.out.println("Available operations: Addition, Subtraction, Multiplication, and Division.\nChoose by entering one of the following symbols: +, -, * and / !");
            System.out.print("Input: ");
            operator = input.next();

            System.out.println("Enter any number.");
            System.out.print("Input: ");
            number1 = input.nextDouble();

            System.out.println("Enter another number.");
            System.out.print("Input: ");
            number2 = input.nextDouble();

            if (operator.equals("+")) {
                result = number1 + number2;
            } else if (operator.equals("-")) {
                result = number1 - number2;
            } else if (operator.equals("*")) {
                result = number1 * number2;
            } else if (operator.equals(":") || operator.equals("/")) {
                result = number1 / number2;
            } else {
                System.out.println("Invalid operator!");
                return;
            }

            String displayNumber1 = (number1 % 1 == 0) ? String.valueOf((int) number1) : String.valueOf(number1);
            String displayNumber2 = (number2 % 1 == 0) ? String.valueOf((int) number2) : String.valueOf(number2);
            String displayResult = (result % 1 == 0) ? String.valueOf((int) result) : String.valueOf(result);

            System.out.println("The result of " + displayNumber1 + " " + operator + " " + displayNumber2 + " is " + displayResult + "!");

            System.out.println("Would you like to perform another calculation? (Y/N)");
            answer = input.next();
        } while (answer.equalsIgnoreCase("Y"));
        System.out.println("Thanks for trying! Goodbye!");
    }
}
