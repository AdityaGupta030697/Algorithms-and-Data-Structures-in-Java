//ShellSort
//Unstable Algorithm
//in place - requires no extra space
//Gap initialized to half of arrayLength 

import java.util.*;

public class Shellsort {

    public static void main(String args[]) {
        int[] intArray = {2, 4, 5, 1, 78, 3, 24, 243};

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];

                int j = i;

                while ((j >= gap) && (intArray[j - gap] > newElement)) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;

                }

                intArray[j] = newElement;

            }

        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);

        }

    }

}
