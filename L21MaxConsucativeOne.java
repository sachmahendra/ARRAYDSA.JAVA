public class L21MaxConsucativeOne {
    static int maxConsecutiveOne(int arr[]) {
        int res = 0, curr = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                curr = 0;

            else
                curr++;
            res = Math.max(res, curr);

        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 1, 1, 0, 1, 1, 1 }, n = 9;

        System.out.println(maxConsecutiveOne(arr));
    }
}
