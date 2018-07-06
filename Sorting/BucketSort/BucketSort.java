// Bucket Sort
// Uses Hashing
// Makes assumptions about data like radix, count sort
// O(n) - Time Complexity - only when there is one item per bucket
// Distributes values in buckets, sort each bucket and then finally combine them.
// Not Inplace - requires extra space

import java.util.*;

public class BucketSort {

    public static void main(String args[]) {
        int[] intArray = {54, 46, 83, 66, 95, 92, 43};
        bucket_Sort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void bucket_Sort(int[] input) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < input.length; i++) {
            buckets[hash(input[i])].add(input[i]);
        }

        for (List bucket : buckets) {
            Collections.sort(bucket);
        }
        int j = 0;

        for (int i = 0; i < buckets.length; i++) {
            for (int value : buckets[i]) {
                input[j++] = value;
            }
        }

    }

    private static int hash(int value) {
        return (value / (int) 10);
    }
}
