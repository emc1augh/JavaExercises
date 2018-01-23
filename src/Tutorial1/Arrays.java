package Tutorial1;

public class Arrays {

    public static void main(String args []) {

        int numbers[] = new int[20];

        for(int i = 1; i < numbers.length; i++) {
            numbers[0] = 1;
            numbers[i] = numbers[i-1]*2;
        }
        System.out.println("Array 1: " + java.util.Arrays.toString(numbers));

        int numbers2[] = new int[20];

        for(int j = 1; j<numbers2.length-1; j++){
            numbers2[0]=numbers[0];
            numbers2[19]=numbers[19];
            numbers2[j] = (numbers[j-1]+numbers[j+1])/2;
        }
        System.out.println("Array 2: " + java.util.Arrays.toString(numbers2));
    }
}
