package codes;
import java.util.Arrays;

public class Main {
    // Linear time routine for partitioning step
    static int partition(int[] arr, int n) {
        int pind = 0;

        // each time we find a positive number we move it to the
        // left side before the pivot
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) { // pivot is 0
                int temp = arr[i];
                arr[i] = arr[pind];
                arr[pind] = temp;
                pind++;
            }
        }

        // return index of the first non-positive number
        return pind;
    }

    // Function for finding the first missing positive number
    static int firstMissingPositive(int[] arr, int n) {
        int k = partition(arr, n);

        // Traverse the positive part of the array
        for (int i = 0; i < k; i++) {
            // get the absolute value of the current element
            int val = Math.abs(arr[i]);

            // If the absolute value is within range and the
            // element at index `val-1` is positive, mark its
            // presence by changing its sign to negative
            if (val - 1 < k && arr[val - 1] > 0) {
                arr[val - 1] = -arr[val - 1];
            }
        }

        // Traverse the positive part of the array again to find
        // the smallest missing positive number
        for (int i = 0; i < k; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }

        // If all numbers from 1 to k are present, then the
        // missing number is `k + 1`
        return k + 1;
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {0, 10, 2, -10, -20};
        int n = arr.length;

        int ans = firstMissingPositive(arr, n);

        System.out.println(ans);
    }
}
