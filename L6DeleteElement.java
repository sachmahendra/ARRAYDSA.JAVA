public class L6DeleteElement {
    static int deleteEle(int arr[],int n , int x){
        int i;
        for(i=0;i<n;i++)
        {
        if(arr[i]==x)
        break;
        }
        if(i==n)
        return n;
        for(int j=i;j<n-1;j++){
            arr[j]=arr[j+1];
        }
        return n-1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,45,5,12};
        int n=6;
        int x=3;
        n = deleteEle(arr, n, x);
        System.out.println("after deletion");
        for(int i=0; i < n; i++)
        {
                System.out.print(arr[i]+" ");
        }
    }
}