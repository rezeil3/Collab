package com.ftw.exercise.javafoundation.m3;

public class ArraysExercise {
    public static void main(String[]args){
        int numArray[] = new int[16];
        int sum = 0;

        numArray[0] = 1;

        for (int i=0; i<15; i++){
            numArray[i+1] = numArray[i]*2;
            System.out.println(numArray[i]);
            sum += numArray[i];
        }

        System.out.println("Sum of all input is: " + sum);
        System.out.println("Average of input is: " + sum/15);
    }
}
