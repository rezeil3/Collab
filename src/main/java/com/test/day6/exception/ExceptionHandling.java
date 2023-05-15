package com.accenture.day6.exception;

import java.util.Scanner;

public class ExceptionHandling {
        //Exception - possible errors that we can encounter and need to address

        public static void main(String[] args) {
//                try {
//                        //int[] myInt = null;
//                        int[] myInt = {12,87,968,6,47,24857,3,24,9};
//                        System.out.println(myInt[15]);
//                } catch (ArrayIndexOutOfBoundsException e){
//                        System.out.println("Error Occurred: " + e.getLocalizedMessage());
//                } catch (NullPointerException e){
//                        System.out.println("Error Occurred: " + e.getLocalizedMessage());
//                }  catch (Exception e) {
//                        System.out.println("Error Occurred: " + e.getLocalizedMessage());
//                }
                try {
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Enter First Number: ");
                        int firstNum = scanner.nextInt();
                        System.out.print("Enter Second Number: ");
                        int secNum = scanner.nextInt();
                        System.out.println("Answer: " + (firstNum/secNum));
                } catch (ArithmeticException e){
                        System.out.println("Error Occurred: " + e.getMessage());
                }  catch (Exception e) {
                        System.out.println("Error Occurred: " + e.getMessage());
                }


        }

}
