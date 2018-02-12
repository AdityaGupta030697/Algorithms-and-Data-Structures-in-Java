// Assumptions are made for the input data.
// Don't use comparisons
// Count the number of occurance of each value
// only works with non-negaive discrete values (not with float, strings)
// values must be within a specific range
// Not - in place algorithm : temporary array is being used 
// O(n) - can achieve this
// can be made statble with some extra work

public class Counting_Sort {

    public static void main(String args[]) {
        // initialize the array
        int[] intArray = {2, 4, 5, 1, 7, 8, 3, 2, 4, 2, 4, 3};

        // call countingSort with the range of numbers - the assumption made.
        countingSort(intArray, 1, 10);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void countingSort(int[] array, int min, int max) {
        // create temporary array of size range 
        int[] temparray = new int[max - min + 1];

        // count the instance of numbers
        for (int i = 0; i < array.length; i++) {
            temparray[array[i] - min]++;
        }

        // fill the original array with the instances.
        int j = 0;

        for (int i = min; i <= max; i++) {
            while (temparray[i - min] > 0) {
                array[j++] = i;
                temparray[i - min]--;
            }

        }

    }

}
