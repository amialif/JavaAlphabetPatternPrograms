package com.practicehouse.alphabetPattern2;

import java.util.Scanner;
/**
 * @author arifur.rahman
 */
public class JavaAlphabetPattern2 {

    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);

        System.out.println("How Many Lines You Want to Print ?");
        number = sc.nextInt();

        System.out.println("Printing " + (char) (number + 64) + " to A.");
        System.out.println("----------------------------------------");
        for (int index = number; index >= 1; index--) {
            for (int secIndex = 1; secIndex <= index; secIndex++) {
                System.out.print((char) (index + 64));
            }
            System.out.println("");
        }
    }

}
