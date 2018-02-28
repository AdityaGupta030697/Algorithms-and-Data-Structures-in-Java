// Radix Sort for Strings.
// Assumptions are made for the input data.
// Data must have same radix and width 
// Data must be integers or Strings
// Sort based on individual digits/letter position
// O(n) - can achieve this
// stable algorithm

import java.util.*;

public class Radix_Sort_String {

    public static void main(String args[]) {

        // initialize the array
        String[] intArray = {"bcdef", "dbacc", "abcde", "omadd", "bbbbb"};

        // call to radix sort
        RadixSort(intArray, 26, 5);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void RadixSort(String[] input, int radix, int width) {
        for (int i = width - 1; i >= 0; i--) {
            // Sorting the input array starting from unit's place till last character from right
            RadixSingleSort(input, i, radix);
        }

    }

    public static void RadixSingleSort(String[] input, int position, int radix) {

        int num = input.length;

        // using stable counting sort for sorting
        int[] CountArray = new int[radix];

        for (String in : input) {
            CountArray[getIndex(position, in)]++;
        }

        // Adjust the count array
        for (int i = 1; i < radix; i++) {
            CountArray[i] += CountArray[i - 1];
        }

        String[] temp = new String[num];

        // filling in values in temp array using CountArray while keeping in mind the relative order of elements in input array
        for (int k = num - 1; k >= 0; k--) {
            temp[--CountArray[getIndex(position, input[k])]] = input[k];

        }

        // copying the temp array into input array
        System.arraycopy(temp, 0, input, 0, num);

    }

    public static int getIndex(int position, String str) {
        
        // return relative ascii value
        return str.charAt(position) - 'a';
    }

}
