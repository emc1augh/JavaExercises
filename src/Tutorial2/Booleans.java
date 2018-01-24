package Tutorial2;

import java.util.Scanner;

public class Booleans {

    private static boolean isEven (int number) {
        boolean isEven = (number % 2 == 0);

            return isEven;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number or type 'exit' to terminate the system");
        while (scanner.hasNextInt()){
            int eventest = scanner.nextInt();
            if(isEven(eventest)){
            System.out.println("This number is even");
            } else {
            System.out.println("This number is odd");
            }
            if (scanner.hasNext("exit")){
                System.exit(0);
            }
        }
    }
}
