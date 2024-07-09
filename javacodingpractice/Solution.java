package codingEx1;

import java.util.Scanner;
import java.util.Stack;

class Solution{

    static int minJumps(int[] arr,int n){
        int current = n-1; //10
        int jumps = 0;
        while(current > 0){
            jumps++;
            int next = current;
            for(int i=current-1; i>=0; i--){
                if(i+arr[i] >= current){
                    next = i;
                }
            }
            if(current == next)
                return -1;
            current = next;
        }
        return jumps;
    }
    public static int equilibriumPoint(long[] arr) {
        // Your code her
        int n=arr.length;
        long leftsum,rightsum;
        for(int i=1;i<=n;i=i+1){
            leftsum=0;
            for(int j=1;j<i;j++)
                leftsum=leftsum+arr[j];
            rightsum=0;
            for(int j=i+1;j<=n;j++)
                rightsum=rightsum+arr[j];
            if(leftsum==rightsum)
                return i;
        }
        return -1;
    }
    public static boolean isBalanced(String expression) {
    	  if ((expression.length() % 2) == 1) return false;
    	  else {
    	    Stack<Character> s = new Stack<>();
    	    for (char bracket : expression.toCharArray())
    	      switch (bracket) {
    	        case '{': s.push('}'); break;
    	        case '(': s.push(')'); break;
    	        case '[': s.push(']'); break;
    	        default :
    	          if (s.isEmpty() || bracket != s.peek()) { return false;}
    	          s.pop();
    	      }
    	    return s.isEmpty();
    	  }
    	}
 public static void main(String[] ar) {
    	long arr[]= {1,3,5,2,2};
    	int n=arr.length;
    	//int maxlength=minJumps(arr,n);
    	//System.out.println(arr[n-1]);
    	//System.out.println(maxlength);
    	//System.out.println(equilibriumPoint(arr));
    	 Scanner in = new Scanner(System.in);
    	    String expression = in.nextLine();
    	    boolean answer = isBalanced(expression);
    }
}