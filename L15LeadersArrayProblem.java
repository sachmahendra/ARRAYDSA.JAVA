public class L15LeadersArrayProblem {
    static void leader(int arr[],int n){
        int curr_ldr=arr[n-1];
        System.out.println(curr_ldr);
        for(int i=n-2;i>=0;i--){
            if(curr_ldr<arr[i])
            {
                curr_ldr=arr[i];
                System.out.println(curr_ldr);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30};
        int n=3;
        leader(arr, n);
    }
}
