package com.accenture.day6.exception.customize;

import java.util.Scanner;

public class CustomExceptionImpl {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: " );
        String name = scanner.nextLine();

        try {
            if (name.isEmpty()){
                throw new CustomException(CustomException.EMPTY_NAME);
            } else if (!(name.equalsIgnoreCase("java"))) {
                throw new CustomException(CustomException.INCORRECT_NAME);
            } else {
                System.out.println("The name you entered is " + name + " correct. You may now proceed.");
            }
        } catch (CustomException e){
            System.out.println("Exception: " + e.getMessage());
        }
//        if (name.isEmpty()){
//            //throw new CustomException(CustomException.EMPTY_NAME);
//            System.out.println(CustomException.EMPTY_NAME);
//        } else if (!(name.equalsIgnoreCase("java"))) {
//            throw new CustomException(CustomException.INCORRECT_NAME);
//        } else {
//            System.out.println("The name you entered is " + name + " correct. You may now proceed.");
//        }
    }
}
