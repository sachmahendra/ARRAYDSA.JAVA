public class L8SecondLargestElement {

    static int SecLargest(int A[],int n){

    int max1 =A[0],max2 = A[0];
        for(int i = 0;i<A.length;i++){
            
            if(A[i]>max1){
            max2 = max1;  //WE USE THIS BEFORE LINE 9 BEZ AGR CONDITION TRUE HOTI HAI TO PHLE MAX1 KO MAX2 ME ASSIGN KR DEN
            max1 = A[i];
            
            }
            else if(A[i]>max2){
                max2 = A[i];
            }
          
        }
        return max2;
    }
    public static void main(String[] args) {
        int A[]= {3,9,7,8,12,6,15,5,4,10};
        System.out.println(SecLargest(A, 10));
    }
}