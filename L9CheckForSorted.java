//IT IS NOT A EFFICENT METHOD
/* 
public class L9CheckForSorted {
    static boolean isSorted(int A[]){
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[j]<A[i])   // ONLY FOR INCREASING ARRAY
                return false;
            }
            
        }
        return true;
        
    }
    public static void main(String[] args) {
        int A[]={5,12,13,2,34};
      // int A[]={1,2,3,4};
        System.out.println(isSorted(A));
    }
}

//TIME COM = O(N^2)
*/
//EFFICIENT METHOD

public class L9CheckForSorted {
    static boolean isSorted(int A[]){
        for(int i=1;i<A.length;i++){
            if(A[i]<A[i-1])
            return false;
        }
        return true;
        
    }
    public static void main(String[] args) {
        //int A[]={5,12,13,2,34};
         int A[]={1,2,3,4};
        System.out.println(isSorted(A));
    }
}
//TIME COM = O(N)