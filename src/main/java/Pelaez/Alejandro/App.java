/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package Pelaez.Alejandro;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        final int legalAge = 16;
        System.out.print("What is your age? ");
        Scanner input = new Scanner(System.in);
        int userAge = input.nextInt();

        String notOldEnough = "You are not old enough to legally drive.";
        String oldEnough = "You are old enough to legally drive.";

        System.out.println(userAge >= legalAge ? oldEnough : notOldEnough);
    }
}
