// Radix Sort.
// Assumptions are made for the input data.
// Data must have same radix and width. 
// Data must be integers or Strings.
// Sort based on individual digits/letter position.
// O(n) - can achieve this.
// stable algorithm.

import java.util.*;

public class Radix_Sort {

    public static void main(String args[]) {

        // initialize the array
        int[] intArray = {4725, 4586, 1330, 8792, 1594, 5729};

        // call to radix sort
        RadixSort(intArray, 10, 4);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void RadixSort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            // Sorting the input array starting from unit's place till last digit from right
            RadixSingleSort(input, i, radix);
        }

    }

    public static void RadixSingleSort(int[] input, int position, int radix) {

        int num = input.length;

        // using stable counting sort for sorting
        int[] CountArray = new int[radix];

        for (int in : input) {
            CountArray[getDigit(position, in, radix)]++;
        }

        // Adjust the count array
        for (int i = 1; i < radix; i++) {
            CountArray[i] += CountArray[i - 1];
        }

        int[] temp = new int[num];

        // filling in values in temp array using CountArray while keeping in mind the relative order of elements in input array
        for (int k = num - 1; k >= 0; k--) {
            temp[--CountArray[getDigit(position, input[k], radix)]] = input[k];

        }

        // copying the temp array into input array
        System.arraycopy(temp, 0, input, 0, num);

    }

    public static int getDigit(int position, int input, int radix) {
        // division operator has higher precendance than modulo 
        return input / (int) Math.pow(radix, position) % radix;
    }

}
