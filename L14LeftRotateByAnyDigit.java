public class L14LeftRotateByAnyDigit {
    static void leftRotate(int arr[],int n,int d){
        int temp[]=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=0;i<d;i++){
            arr[n-d+i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=5;
        int d=2;
        System.out.println("before rotation");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        leftRotate(arr, n,d);
        System.out.println("After rotation");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
