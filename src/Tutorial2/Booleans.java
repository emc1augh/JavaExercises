package Tutorial2;

import java.util.Scanner;

public class Booleans {

    private static boolean isEven (int number) {
            return (number % 2 == 0);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number or type 'exit' to terminate the system");
        while (scanner.hasNextInt()){

            int evenTest = scanner.nextInt();

            String result = isEven(evenTest) ? "even" : "odd";

            System.out.println("This number is " + result);

            if (scanner.hasNext("exit")){
                System.exit(0);
            }

        }
    }
}
