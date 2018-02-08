// BubbleSort
// Stable Algorithm
// in place - requires no extra space
// O(n^2) - Time Complexity

import java.util.*;

public class Bubble_sort {

    // variable to count no of swaps made
    public static int swaps_i = 0;

    public static void main(String args[]) {
        int[] intArray = {2, 4, 5, 1, 78, 3, 24, 243};

        for (int i = 0; i <= intArray.length - 1; i++) {

            for (int j = 1; j < intArray.length - i; j++) {
                if (intArray[j - 1] > intArray[j]) {
                    swap(intArray, j - 1, j);
                }
            }

        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        } else {
            swaps_i++;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            return;
        }
    }
}
