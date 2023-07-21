import java.util.ArrayList;

public class Duplicate {
    public static int duplicates(int arr[], int n) {
        // code here
        int res = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 5 };
        int n = 4;
        System.out.println(duplicates(arr, n));
    }
}
