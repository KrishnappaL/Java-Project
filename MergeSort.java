package codeEx2;

import java.util.Arrays;

public class MergeSort {
	 public static <T extends Comparable> void apply(int[] arr) {
	        int n = arr.length;
	        if (n < 2) 
	            return;
	        int mid = n / 2;

	        var left = Arrays.copyOfRange(arr, 0, mid);
	        var right = Arrays.copyOfRange(arr, mid, n);

	        apply(left);
	        apply(right);

	        merge(arr, left, right);
	    }

	    private static <T extends Comparable> void merge(int[] arr, int[] left, int[] right) {
	        int leftLength = left.length;
	        int rightLength = right.length;
	        int i = 0, j = 0, k = 0;

	        while (i < leftLength && j < rightLength) {
	            if (lessOrEqualsThan(left[i], right[j])) {
	                arr[k] = left[i];
	                k++;
	                i++;
	            } else {
	                arr[k] = right[j];
	                k++;
	                j++;
	            }
	        }

	        while (i < leftLength) {
	            arr[k] = left[i];
	            k++;
	            i++;
	        }
	        while (j < rightLength) {
	            arr[k] = right[j];
	            k++;
	            j++;
	        }
	    }

	    private static <T extends Comparable> boolean lessOrEqualsThan(T a, T b) {
	        return a.compareTo(b) <= 0;
	    }
	    public static void main(String[] args) {
	    	int arr[]= {6,4,7,2,1};
	    	apply(arr);
	    }
	}

