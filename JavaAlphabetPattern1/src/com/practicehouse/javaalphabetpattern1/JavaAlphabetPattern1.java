package com.practicehouse.javaalphabetpattern1;

import java.util.Scanner;

/**
 *
 * @author arifur.rahman
 */
public class JavaAlphabetPattern1 {

    public static void main(String[] args) {

        int number;

        Scanner sc = new Scanner(System.in);

        System.out.println("How Many Lines You Want to Print ?");
        number = sc.nextInt();

        for (int index = 1; index <= number; index++) {
            for (int secIndex = 1; secIndex <= index; secIndex++) {
                System.out.print((char) (index + 64));
            }
            System.out.println("");
        }
    }

}
