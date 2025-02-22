package TwoPointer;

public class minimise_MAX_MIN {
    // Optimized approach to minimize the difference between the max and min of the
    // 3 numbers (1 from each array)
    public static void main(String[] args) {
        int[] a = { 3, 14, 16, 23 };
        int[] b = { -6, 23, 24, 30 };
        int[] c = { -15, 15, 26, 31 };
        int i = 0, j = 0, k = 0;
        int ans = Integer.MAX_VALUE;
        while(i <a.length && j < b.length && k < c.length){
            int max = Math.max(a[i], Math.max(b[j], c[k]));
            int min = Math.min(a[i], Math.min(b[j], c[k]));
            ans = Math.min(ans, max - min);
            if(min == a[i]) i++;
            else if (min == b[j]) j++;
            else k++;
        }

        System.out.println(ans);
    }

}
