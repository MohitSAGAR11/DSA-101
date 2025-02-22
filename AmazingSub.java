import java.util.*;

public class AmazingSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int MOD = 10003;
        for (int t = 0; t < T; t++) {
            String S = sc.next();
            int n = S.length();
            int count = 0;
            for (int i = 0; i < n; i++) {
                char c = S.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    count +=  (n - i) ;
                }  
            }
            System.out.println(count % MOD);
        }
        sc.close();
    }
}
