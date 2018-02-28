// InsertionSort using recursion
// Stable Algorithm
// in place - requires no extra space
// O(n^2) - Time Complexity

import java.util.*;

public class Insertion_Sort_Rec {

    public static void main(String args[]) {

        int[] intArray = {2, 4, 5, 1, 78, 3, 24, 243};

        // function call
        insertionSort(intArray, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void insertionSort(int[] array, int numElements) {

        // Base case
        if (numElements < 2) {
            return;
        }

        // Recursive call
        insertionSort(array, numElements - 1);

        int new_element = array[numElements - 1];

        int i;

        // Swapping to set element to its correct postion
        for (i = numElements - 1; i > 0 && array[i - 1] > new_element; i--) {

            array[i] = array[i - 1];

        }

        array[i] = new_element;

    }

}
