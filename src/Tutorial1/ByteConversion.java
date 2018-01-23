package Tutorial1;

import java.util.Scanner;

public class ByteConversion {

    public static void main(String args[]) {

        final String[] UNITS = {"B", "KB", "MB", "GB"};

        System.out.println("Please enter the number of Bytes you would like to convert");

        Scanner byteconverter = new Scanner(System.in);
        double bytes = byteconverter.nextInt();

        Double [] Output = new Double[4];

        Output[0] = bytes;

        System.out.println("\nThis gives: ");
        System.out.println(Output[0] + " " + UNITS[0]);

        for (int i = 0; i < 3; i++) {
            Output[i+1] = Output[i]/Math.pow(2,10);
            System.out.println(Output[i+1] + " " + UNITS[i+1]);
        }

    }
}
