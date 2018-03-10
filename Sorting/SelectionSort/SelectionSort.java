// SelectionSort
// Stable Algorithm
// in place - requires no extra space
// O(n^2) - Time Complexity

public class SelectionSort {

    public static int[] intArray = {2, 4, 5, 1, 78, 3, 24, 243};

    public static void main(String args[]) {

        // selecting the min element
        for (int i = 0; i < intArray.length; i++) {

            int min = intArray[i];
            int index = i;

            for (int j = i; j < intArray.length; j++) {
                if (min > intArray[j]) {
                    min = intArray[j];
                    index = j;
                }

            }
            if (i != index) {
                swap(intArray, i, index);
            }

        }
        print();
    }

    public static void print() {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        System.out.println('\n');
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        } else {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            return;
        }
    }

}
