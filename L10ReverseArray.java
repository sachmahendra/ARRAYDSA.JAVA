public class L10ReverseArray {
    static void reverse(int A[],int n){
        //int n=A.length;
        int high =n-1 ; 
        int low = 0;
        while(high>low){
            int temp=A[low];
            A[low]=A[high];
            A[high]=temp;
            high--;
            low++;
        }
    }
    public static void main(String[] args) {
        int A[]={5,4,12,25};
        int n=4;
        System.out.println("before reverse arr is: ");
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        reverse(A, n);
        System.out.println("After reverse : ");
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
    }
}
