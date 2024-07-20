package cache;
public class RainWater implements Runnable {

    public static void main(String[] args) {
        new RainWater().run();
    }

    @Override
    public void run() {
        int[] height = { 6,9,9};
        System.out.println(trappingWater(height,height.length));
    }
    
    int trappingWater(int arr[], int n){
    int left[]=new int[n];
    left[0]=arr[0];
    int right[]=new int[n];
    
    right[n-1]=arr[n-1];
    int sum=0;
    for(int i=1;i<n;i++)
    {
       left[i]=Math.max(left[i-1],arr[i]);
        
    }
    int j=1;//3,0,0,2,0,4
    for(int i=n-2;i>=0;i--)
    {
        right[i]=Math.max(right[i+1],arr[i]);
        
    }
    
    for(int i=0;i<n;i++)
    {
        sum=sum+Math.min(right[i],left[i])-arr[i];
    }
    
    return sum;
    }

}
