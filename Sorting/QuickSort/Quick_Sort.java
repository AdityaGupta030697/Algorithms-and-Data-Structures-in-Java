// Quick Sort
// Divide and Conquer
// Recursive Algorithm
// in place algorithm - no temporary array required!
// Run Time = O(nlogn)- base 2
// Unstable Algorithm

import java.util.*;

public class Quick_Sort {

    public static void main(String args[]) {
        int[] intArray = {2, 4, 5, 1, 78, 3, 24, 243};
        
        // call to quicksort
        quickSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void quickSort(int[] array, int start, int end) {
        
        // return if array size is 1
        if (end - start < 2) {
            return;
        }

        int pivotIndex = Partition(array, start, end);

        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex + 1, end);

    }

    public static int Partition(int[] array, int start, int end) {
        
        // using first element as pivot
        int pivot = array[start];
        int i = start;
        int j = end;

        while (i < j) {
            
            // empty loop body
            while ((i < j) && (array[--j] >= pivot));
            if (i < j) {
                array[i] = array[j];
            }

            // empty loop body
            while ((i < j) && (array[++i] <= pivot));
            if (i < j) {
                array[j] = array[i];
            }

        }

        array[j] = pivot;
        return j;

    }

}
