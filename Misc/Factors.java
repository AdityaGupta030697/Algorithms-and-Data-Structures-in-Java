// Time complexity - O(N^(0.5))

import java.util.*;
import java.math.*;

public class Factors {

    public static void factors(int n) {

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " , ");
                if (i != Math.sqrt(n)) {
                    System.out.print(n / i + " , ");
                }
            }
        }
    }

    public static void main(String args[]) {

        factors(36);
        // Output - 2 , 18 , 3 , 12 , 4 , 9 , 6 ,

    }

}
