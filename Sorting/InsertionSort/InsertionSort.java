// InsertionSort
// Stable Algorithm
// in place - requires no extra space
// O(n^2) - Time Complexity

import java.util.*;

public class Insertion_Sort {

    public static void main(String args[]) {

        int[] intArray = {2, 4, 5, 1, 78, 3, 24, 243};

        for (int i = 1; i <= intArray.length - 1; i++) {

            int new_no = intArray[i];
            int index = i;

            // finding the index to be swapped
            while ((index > 0) && (new_no < intArray[index - 1])) {
                index--;
            }

            if (index != i) {
                // shifting array contents to the right
                for (int j = i; j > index; j--) {
                    intArray[j] = intArray[j - 1];
                }

                intArray[index] = new_no;

            }

        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

}
