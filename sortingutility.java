// SortingUtility.java
// Author: Divya Bhargavi
// Description: Demonstrates sorting algorithms in Java using OOP principles.

import java.util.Arrays;
import java.util.Scanner;

public class SortingUtility {

    // Method to perform Bubble Sort (Ascending)
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to perform Selection Sort (Descending)
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap elements
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nOriginal Array:");
        printArray(arr);

        // Perform Bubble Sort
        bubbleSort(arr);
        System.out.println("Sorted Array (Ascending using Bubble Sort):");
        printArray(arr);

        // Perform Selection Sort
        selectionSort(arr);
        System.out.println("Sorted Array (Descending using Selection Sort):");
        printArray(arr);

        sc.close();
    }
}
