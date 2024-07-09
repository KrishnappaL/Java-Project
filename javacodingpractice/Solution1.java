package codingEx1;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int a[]= {0,1,2,2,1,0};
		//sort012(a,n);
		int arr[]= {3, 2, 2, 3, 2};
		int size=arr.length;
int ele=MajorityElement(arr,size);
System.out.print(ele);
		}
public static void sort012(int a[], int n)
    {
        int temp,i,j;
        for( i=0;i<n;i++){
         for(j=i+1;j<n;j++)
            if(a[i]>a[j]){
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
            }
         }
        
    
    for(i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
//3, 2, 2, 3, 2
public static int MajorityElement(int arr[],int size) {
int count = 0, i, majorityElement = 0;
for (i = 0; i < size; i++) {
    if (count == 0)
        majorityElement = arr[i];
    if (arr[i] == majorityElement) 
        count++;
    else
        count--;
}
count = 0;
for (i = 0; i < size; i++)
    if (arr[i] == majorityElement)
        count++;
if (count > size/2)
    return majorityElement;
return -1;
}

}