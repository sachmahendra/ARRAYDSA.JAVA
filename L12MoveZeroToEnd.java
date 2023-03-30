public class L12MoveZeroToEnd {
    static void moveZeros(int A[],int n){
       // int n=A.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(A[i]!=0)
            {
                int temp =A[i];
                A[i]=A[count];
                A[count]=temp;
                count++;
            }

        }
    }
    public static void main(String[] args) {
        int A[]={8,5,0,10,0,20};
        int n=6;
        System.out.println("before operation");
        for(int i=0;i<n;i++){
            System.out.println(A[i]+" ");
        }
        System.out.println();
        moveZeros(A, n);
        System.out.println("after operation");
        for(int i=0;i<n;i++){
            System.out.println(A[i]+" ");
        }
    }
}
