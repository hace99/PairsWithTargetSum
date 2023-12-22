package org.example;

import java.util.Scanner;

public class PairsWithTargetSum {

    static void pairs_value(int[] inputArray, int inputNumber) {
        System.out.println("Coppie di elementi e la loro somma:");


        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == inputNumber) {
                    System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la dimensione dell'array: ");
        int size = scanner.nextInt();

        int[] userArray = new int[size];

        System.out.println("Inserisci gli elementi dell'array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            userArray[i] = scanner.nextInt();
        }

        System.out.print("Inserisci il numero target: ");
        int targetNumber = scanner.nextInt();

        pairs_value(userArray, targetNumber);

        scanner.close();
    }
}
