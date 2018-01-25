package Tutorial3;

import java.util.Scanner;

public class RobotMain {

    public static void main(String[] args) {

        RobotMove r = new RobotMove();

        RobotTalk s = new RobotTalk();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose an operation:" + "\n 1. Move\n 2. Charge\n 3. Speak\n 4. Exit");

        while(scanner.hasNextInt()) {

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("How far would you like to move?");
                    int move = scanner.nextInt();
                    r.move(move);
                    break;
                case 2:
                    System.out.println("How much would you like to charge?");
                    int charge = scanner.nextInt();
                    r.batteryReCharge(charge);
                    break;
                case 3:
                    s.speak();
                    break;
                case 4:
                    System.out.println("Exiting");
                    System.exit(0);
                    break;
            }
            System.out.println("Please choose an operation:" + "\n 1. Move\n 2. Charge\n 3. Speak\n 4. Exit");
        }
    }
}