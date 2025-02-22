public class KsuchthatLength {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 5, 4, 6, 3, 7, 2 };
        int B = 20;
        System.out.println(solve(arr, B));
    }

    static int solve(int[] arr, int B) {
        int n = arr.length;
        int prefix[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + arr[i - 1];
        }

        int start = 1;
        int end = n;
        int result = 0;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (s(mid, prefix) < B) {
                result = mid;   
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    static int s(int l, int prefix[]) {
        int maxsum = Integer.MIN_VALUE;
        for (int i = l; i < prefix.length; i++) {
            maxsum = Math.max(maxsum, prefix[i] - prefix[i - l]);
        }
        return maxsum;
    }
}