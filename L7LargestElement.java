class L7LargestElement{
    static int Max(int A[],int n){
        int max=A[0];

        for(int i = 0;i<A.length;i++){
          if(A[i]>max){
            max = A[i];
            }
        }
        return max;
   
    }
public static void main(String[] args) {
        int A[]= {3,9,7,8,12,6,15,5,4,10};
        
        System.out.println(Max(A, 10));
    }
}

//Time complexity is theta(n)
