import java.util.*;
class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        reverse(arr, 0, d - 1);

    	reverse(arr, d, n - 1);

    	reverse(arr, 0, n - 1);

    }

    static void reverse(int arr[], int low, int high)
    {
    	while(low < high)
    	{
    		int temp = arr[low];
    		arr[low] = arr[high];
    		arr[high] = temp;

    		low++;
    		high--;
    	}
        
    }


  public static void main(String[] args){
      Scanner scn= new Scanner(System.in);  
     // System.out.println("number of element");
      int n=scn.nextInt();
     // System.out.println("number of digit");
      int d=scn.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=scn.nextInt();
      }
      System.out.println();
      rotateArr(arr, d, n);
      for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
      }
      
  }
  
}