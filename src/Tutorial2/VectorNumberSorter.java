package Tutorial2;

import java.util.Scanner;
import java.util.Vector;

public class VectorNumberSorter {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>(50);
        int num;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please enter your numbers: ");
            num = scanner.nextInt();

            if (vector.size() == 0) {
                vector.add(num);
            } else {
                for (int i = 0; i < vector.size(); i++) {
                    if (num > vector.get(vector.size() - 1)) {
                        vector.add(num);
                        break;
                    } else if (num <= vector.get(i)) {
                        vector.add(i, num);
                        break;
                    }
                }
                System.out.println(vector);
            }
        } while(num!=0);

        scanner.close();
        System.out.println("Exit");

    }
}
