import java.util.Scanner;

public class EveninInt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        int prefix[] = new int[N + 1];
        int c = 0;
        for (int i = 1; i <= N; i++) {
            if (A[i - 1] % 2 == 0) {
                prefix[i] = ++c;
            } else {
                prefix[i] = c;
            }

        }
        int q = s.nextInt();
        for (int i = 0; i < q; i++) {
            int start = s.nextInt();
            int end = s.nextInt();
            System.out.println(prefix[end] - prefix[start]);
        }

        s.close();

    }

}
