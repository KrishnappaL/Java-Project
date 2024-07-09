package codingEx1;

import java.util.*;
class DiskSpace
{
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();
  int n=sc.nextInt();
  int arr[]=new int[n];
  for(int i=0;i< n;i++)
   arr[i]=sc.nextInt();

  int min=Integer.MAX_VALUE;
  int max=Integer.MIN_VALUE;

  for(int i=0;i<=n-x;i++)
 {
    min=Integer.MAX_VALUE;
    for(int j=i;j<(i+x);j++)
     min=Math.min(min,arr[j]);
   max=Math.max(min,max);     
 }
 System.out.println(max);
}
}