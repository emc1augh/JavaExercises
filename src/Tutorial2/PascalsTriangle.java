package Tutorial2;

import java.util.Scanner;

public class PascalsTriangle {

    public static void main(String[] args) {
        System.out.println("How high would you like the triangle to be?");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        printPascalsTriangle(size);

    }

    private static void printPascalsTriangle(int numRows) {

        for(int i = 0; i < numRows; i++){
            int n = numRows-1;
            String[] spaces = new String [(n-i)];

            for (int k = 0; k < (n - i); k ++) {
                System.out.print("\t");
            }
            for (int j = 0; j <= i; j++) {
                int x = choose(i, j);
                System.out.print(x + "\t\t");
            }
            System.out.println(" ");
        }
    }
    private static int choose(int a, int b) {
        int top = factorial(a);
        int bottom = (factorial(b))*(factorial(a-b));
        return (top/bottom);
    }
    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int f = 1;
        for (int i = 1; i < n+1; i++) {
            f *= i;
        }
        return f;
    }
}