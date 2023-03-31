public class L16MaxDifferenceProblem {
    static int maxDiff(int arr[],int n){
        int res=arr[1]-arr[0];
        int minvalue=arr[0];
        for(int j=1;j<n;j++){
            res=Math.max(res,arr[j]-minvalue);
            minvalue=Math.min(minvalue,arr[j]);
        }
        return res;
    }

  
public static void main(String[] args){
    int arr[]={2,3,10,6,4,8};
    int n=6;
    System.out.println(maxDiff(arr, n));
}
}