// Time complexity - O(N^(0.5))

import java.util.*;
import java.math.*;

public class PrimeFactorization {

    public static void primeFactorization(int n) {
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            int count = 0;

            while (n % i == 0) {
                count++;
                n = n / i;
            }
            System.out.print(i + "^" + count + "X");
        }
        if (n != 1) {
            System.out.print(n + "^" + "1");
        }
    }

    public static void main(String args[]) {

        primeFactorization(66);
        // Output - 2^1X3^1X11^1

    }

}
