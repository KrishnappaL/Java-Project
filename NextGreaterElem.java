package cache;

import java.util.Stack;

public class NextGreaterElem {

	public static void main(String[] args) {
int arr[]= {1,3,2,4};
int n=arr.length;
nextLargerElement(arr,n);
	}
	 public static long[] nextLargerElement(int[] arr, int n)
	    { 
	         Stack<Integer> stack = new Stack<>();

	        long[] ans = new long[n];
	        for(int i=arr.length-1;i>=0;i--) {
	            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
	        
	                stack.pop();
	            }
	            ans[i] = stack.isEmpty() ? -1 : arr[stack.peek()];
	            stack.push(i);
	        //	System.out.println(stack.peek());

	        }

	        return ans;
	        } 

}
