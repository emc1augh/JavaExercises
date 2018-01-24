package Tutorial2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementRemoval {

    public static void main(String[] args) {

        String[] arr = {"The ", "quick ", "brown ", "fox ", "jumps ", "over ", "the ", "lazy ", "dog "};

        System.out.println("The Current sentence is: " + Arrays.toString(arr) + "\nPlease enter a number to indicate which word to remove.");
        Scanner scanner = new Scanner(System.in);
        int remove = scanner.nextInt();
        arr = remElement(arr,remove-1);

        System.out.print("The new sentence is: " + Arrays.toString(arr) + " ");

    }

    private static String[] remElement(String[] arr, int num) {
        String[] newArr = new String[arr.length-1];
        int counter = 0;

        for(int i=0; i<arr.length; i++){
            if(i != num){
                newArr[i-counter] = arr[i];
            } else {
                counter++;
            }
        }
        return newArr;
    }

}
