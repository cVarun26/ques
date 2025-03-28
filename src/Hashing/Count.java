package Hashing;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input the size of the array
        int size = in.nextInt();
        int arr[] = new int[size];

        // Input the elements of the array
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        // Initialize the hash array to count occurrences of digits 0-9
        int hash[] = new int[10];

        // Count occurrences
        for (int i = 0; i < size; i++) {
            if (arr[i] >= 0 && arr[i] <= 9) {
                hash[arr[i]] += 1;
            } else {
                System.out.println("Error: All elements must be between 0 and 9.");
                return;
            }
        }

        // Print the count of each digit
        for (int i = 0; i < hash.length; i++) {
            System.out.println("Digit " + i + ": " + hash[i]);
        }

    }
}
