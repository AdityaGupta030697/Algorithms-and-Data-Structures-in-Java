// Merge Sort
// Divide and Conquer
// Recursive Algorithm
// Not inplace - use temporary Arrays
// Run Time = O(nlogn)- base 2
// Stable Algorithm

import java.util.*;

public class Merge_Sort {

    public static void main(String args[]) {
        // Sample Array
        int[] intArray = {2, 4, 5, 1, 78, 3, 24, 243};
        
        // Function Call.
        MergeSort(intArray, 0, 8);
        
        // Print the result (Sorted Array).
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void Merge(int[] input, int start, int mid, int end) {

        // Don't need to merge if the last element in left partition is less than first element in right partition 
         
        if (input[mid - 1] <= input[mid]) {
            return;
        }
        
        int left_i = start;
        int right_i = mid;
        int tempIndex = 0;
        
        int[] temp = new int[end - start];
        
        // Merging both partitons by comparison.
        while ((left_i < mid) && (right_i < end)) {
            temp[tempIndex++] = input[left_i] <= input[right_i] ? input[left_i++] : input[right_i++];
        }

        // Merging the rest.
        while (left_i < mid) {
            temp[tempIndex++] = input[left_i++];
        }

        while (right_i < end) {
            temp[tempIndex++] = input[right_i++];
        }
        
        // Copying the temporary array to original one.
        System.arraycopy(temp, 0, input, start, tempIndex);

    }

    public static void MergeSort(int[] input, int start, int end) {
        // Return if array size is 1
        if (end - start < 2) {
            return;
        }
        
        int mid = (start + end) / 2;
        
        // Left partition.
        MergeSort(input, start, mid);  
        // We don't consider mid element in left partition. 
        // Right Partiton.
        MergeSort(input, mid, end);
        // Merging both partitions.
        Merge(input, start, mid, end);

    }
}
