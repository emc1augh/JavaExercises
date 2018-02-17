package OtherPractice;

import java.util.Scanner;

public class PrimeTest {

    public static void main(String[] args) {
        System.out.println("Please enter a number to test for if it is prime");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(!isPrime(input)){
            System.out.println("This is prime");
        } else{
            System.out.println("This is not prime");
        }
    }

    private static boolean isPrime(int input) {
        for(int i=2; i<input-1; i++){
            if(input%i!=0){
                return false;
            }
        }
        return true;
    }
}
