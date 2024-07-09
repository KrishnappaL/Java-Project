package codingEx1;
import java.util.*;
public class NetworkStream
{
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);           
  int n=sc.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<n;i++)
   arr[i]=sc.nextInt();
  int temp=1,max=Integer.MIN_VALUE; 
  for(int i=0;i<n-1;i++)
 {
    temp=1;
    while(2*temp<=arr[i])
      temp=temp*2;
   max=Math.max(temp,max);
  arr[i+1]+=arr[i]-temp;  
}
temp=1;
while(2*temp<=arr[n-1])
 temp=temp*2;
 max=Math.max(temp,max);
 System.out.println(max);
}
}
