package codes;

	import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

		/*
		 * private static int findMaxSubArray(int[] arr, int n, int k) { int maxlen=0;
		 * for(int i=0;i<n;i++) { int sum=0; if(maxlen == n-i) break; for(int
		 * j=i;j<n;j++) { sum+=arr[j]; if(sum == k) maxlen=Math.max(maxlen, j-i+1); } }
		 * //System.out.println(maxlen); return maxlen;
		 * 
		 * }
		 */

class Solution{
    
  // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
  HashMap<Integer, Integer> sum_index_map = new HashMap<>();
        int maxLen = 0;
        int prefix_sum = 0;

        for (int i = 0; i < N; i++) {
            prefix_sum += A[i];

            if (prefix_sum == K) {
                maxLen = i + 1;
            }

            else if (sum_index_map.containsKey(prefix_sum - K)) {
                maxLen = Math.max( maxLen, i - sum_index_map.get(prefix_sum - K));
            }

            if (!sum_index_map.containsKey(prefix_sum)) {
                sum_index_map.put(prefix_sum, i);
            }
        }

        return maxLen;
}
    static void rotateArr(int arr[], int d, int n) {
        int p = 1;
       while (p <= d) {
           int last = arr[0];
           for (int i = 0; i < n - 1; i++) {
               arr[i] = arr[i + 1];
           }
           arr[n - 1] = last;
           p++;
       }
      // int i=0;
       for (int i=0;i<arr.length;i++)
           System.out.print(arr[i] + " ");
       
   }
    public static void main(String[] arg ) {
		/*
		 * int arr[]= {10,5,2,7,1,9}; int k=15; int n=arr.length;
		 * lenOfLongSubarr(arr,n,k);
		 */
    	int arr[]= {1,2,3,4,5};
    	int n=arr.length , d=22;
    	rotateArr(arr,d,n);
    	
    }
}

