package cache;

public class FindingMaxValueInKnapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int W=4,n=3;int wt[]= {4,5,1};
		int val[]= {1,2,3};
knapSack(W,wt,val,n);
	}
	
	    //Function to return max value that can be put in knapsack of capacity W.
	    static void knapSack(int W, int wt[], int val[], int n) 
	    { 
	        int dp[][]=new int[n+1][W+1];
	       for(int i=0;i<n+1;i++)
	       {
	           dp[i][0]=0;
	       }
	       
	        for(int j=0;j<W+1;j++)
	       {
	           dp[0][j]=0;
	       }
	       
	       for(int i=1;i<n+1;i++)
	       {
	           for(int j=1;j<W+1;j++)
	           {
	               if(wt[i-1]<=j)
	               {
	        dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
	               }
	               else
	              dp[i][j]= dp[i-1][j];
	           }
	       }
	       
	       
	       System.out.println( dp[n][W]);
	       } 
	}



