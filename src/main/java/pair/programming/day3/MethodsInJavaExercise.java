package pair.programming.day3;

import java.util.Scanner;

public class MethodsInJavaExercise {

    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int [] rawArray = new int[5];
        int [] oddArray = new int[rawArray.length];

        //Asks for the Input
        System.out.println("Please input 5 integer values:");
        for (int i = 0; i < rawArray.length; i++) {
            rawArray[i] = scn.nextInt();
        }

        //Filters out the odd numbers
        int oddIndex = 0;
        for (int i = 0; i < rawArray.length; i++) {
            oddArray[oddIndex] = getOddValues(rawArray[i]);
            if (oddArray[oddIndex] != 0) {
                oddIndex++;
            }
        }

        //Displays the odd numbers
        System.out.println("Odd values:");
        for (int i = 0; i < oddArray.length; i++) {
            displayOddValues(oddArray[i]);
        }
    }
    public static int getOddValues(int array){
        if (array % 2 != 0) {
            return array;
        }else{
            return 0;
        }
    }
    public static void displayOddValues(int odd){
        if (odd > 0){
            System.out.println(odd);
        }
    }
}
