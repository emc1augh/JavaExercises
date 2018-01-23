package Tutorial1;

import java.util.Scanner;

public class SimpleCalculator {

    public static double add(double a, double b){
        return a+b;
    }

    public static double subtract(double a, double b){
        return a-b;
    }

    public static double multiply(double a, double b){
        return a*b;
    }

    public static double divide(double a, double b){
        return a/b;
    }

    public static double factorial(double a){
        double result = 1;
        for(double i = a; i>0; i--){
            result = result*i;
        }
        return result;
    }

    public static void main(String args []){
        System.out.println("This is a simple calculator. Please choose an operation:\n" + " 1. Add\n" +
                " 2. Subtract\n 3. Multiply\n 4. Divide\n 5. Factorial\n 6. Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        String chosen = null;
        switch (choice){
            case 1: chosen = "add";
                break;
            case 2: chosen = "subtract";
                break;
            case 3: chosen = "multiply";
                break;
            case 4: chosen = "divide";
                break;
            case 5: chosen = "factorial";
                break;
            case 6: System.out.println("You have chosen to exit, goodbye");
                    System.exit(0);
                break;
        }

        if(choice == 5){
            System.out.println("You have chosen " + chosen + ". Please enter a number.");
        } else {
            System.out.println("You have chosen " + chosen + ". Please enter two numbers to " + chosen + " separated by a space");

        }

        Scanner numbers = new Scanner(System.in);
        double num1 = numbers.nextDouble();

        double num2 = 0;
        if(choice < 5) {
            num2 = numbers.nextDouble();
        }

        double result = 0;
        switch (choice){
            case 1: result = add(num1, num2);
                break;
            case 2: result = subtract(num1, num2);
                break;
            case 3: result = multiply(num1, num2);
                break;
            case 4: result = divide(num1, num2);
                break;
            case 5: result = factorial(num1);
        }

        if(choice < 5) {
            System.out.println("You chose to " + chosen + " " + num1 + " and " + num2 + "\nThis gave the answer: " + result);
        } else {
            System.out.println("The result of the " + chosen + " of " + num1 + " gave the answer: " + result);
        }
    }
}
