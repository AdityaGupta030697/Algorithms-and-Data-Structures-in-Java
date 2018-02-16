//Merge Sort - Descending_Order
//Divide and Conquer
//Recursive Algorithm
//Not inplace - use temporary Arrays
//Run Time = O(nlogn)- base 2
//Stable Algorithm
public class Merge_Sort_Desc {
    public static void main(String args[]) {
        int[] intArray = {2, 4, 5, 1, 78, 3, 24, -243};
        
        MergeSort(intArray, 0, 8);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void Merge(int[] input, int start, int mid, int end) {

        // Don't need to merge if the last element in left partition is more than 
        // first element in right partition  
        if (input[mid - 1] >= input[mid]) {
            return;
        }
        int left_i = start;
        int right_i = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];

        while ((left_i < mid) && (right_i < end)) {
            temp[tempIndex++] = input[left_i] >= input[right_i] ? input[left_i++] : input[right_i++];
        }

        while (left_i < mid) {
            temp[tempIndex++] = input[left_i++];
        }

        while (right_i < end) {
            temp[tempIndex++] = input[right_i++];
        }

        System.arraycopy(temp, 0, input, start, tempIndex);

    }

    public static void MergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        MergeSort(input, start, mid);
        // We don't consider mid element in left partition. 
        MergeSort(input, mid, end);

        Merge(input, start, mid, end);

    }
    
}
