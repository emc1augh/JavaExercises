package Tutorial4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class FileHandling {

    static void FileHandler(){
        Scanner input = new Scanner(System.in);

        String[] arrayInput = input.nextLine().split(" ");

        StringBuilder strbuilder = new StringBuilder();

        for(String i : arrayInput){
            try{
                FileReader fileReader = new FileReader(i);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                long lineQuantity = bufferedReader.lines().count();
                bufferedReader.close();

            } catch(FileNotFoundException e) {
                System.out.println(i + " does not exist.\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(strbuilder.toString());
    }

    public static void main(String[] args) {

        FileHandling.FileHandler();

    }

}
