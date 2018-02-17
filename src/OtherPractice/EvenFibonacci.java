package OtherPractice;

import java.util.Vector;

public class EvenFibonacci {

    public static void main(String[] args) {
        Vector<Integer> fibonacci = new Vector<>();

        fibonacci.add(0,1);
        fibonacci.add(1,2);

        for(int i=2; i<40; i++){
            int j = fibonacci.get(i-2) + fibonacci.get(i-1);
            if(j<4000000){
                fibonacci.add(i,j);
            } else{
                break;
            }
        }

        System.out.println(fibonacci);

        int evenSum=0;

        for(int i=0; i<fibonacci.size(); i++){
            if(fibonacci.get(i)%2==0){
                evenSum += fibonacci.get(i);
            }
        }

        System.out.println(evenSum);

    }


}
