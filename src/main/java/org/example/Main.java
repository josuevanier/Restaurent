package org.example;

import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = 0;

        int guessNum = random.nextInt(2, 3);
    while  (true ){
        Scanner console = new Scanner(System.in);
        System.out.println("Guess the number:");
        num1 = console.nextInt();
        if (num1 == guessNum){
            System.out.println("good");
            break;
        }
    }
    }
}