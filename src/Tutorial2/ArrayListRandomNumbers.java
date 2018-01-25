package Tutorial2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayListRandomNumbers {

    private static boolean isEven (int number) {
        return (number % 2 == 0);
    }


    public static void main(String[] args) {

        System.out.println("Enter the size of array you would like");

        Scanner input = new Scanner(System.in);
        int capacity = input.nextInt();

        Random random = new Random();

        ArrayList <Integer> aList = new ArrayList<>(capacity);

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < capacity; i++) {
            int value = random.nextInt(100);
            aList.add(value);

            if(isEven(value)){
                evenSum += value;
            } else {
                oddSum += value;
            }

        }

        System.out.println("The full list is: " + aList.toString());

        int counter = 0;
        for (int i = 0; i < capacity; i++) {
            if (!isEven(aList.get(counter))) {
                int removal = aList.get(counter);
                aList.remove(counter);
                aList.add(removal);
            } else {
                counter++;
            }
        }

        System.out.println("\nThe reordered list is: " + aList.toString());
        System.out.println("\nThe sum of the evens is: " + evenSum);
        System.out.println("\nThe sum of the odds is: " + oddSum);

        int [] arr =  new int[capacity];

        for(int i=0; i<capacity; i++){
            arr[i] = aList.get(i);
        }

        System.out.println("\nThe list in an array is: " + Arrays.toString(arr));
    }
}