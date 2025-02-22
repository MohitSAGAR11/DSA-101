
import java.util.Scanner;

public class FinalStateOfARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // int[] A = new int[N];
        // for (int i = 0; i < N; i++) {
        //     A[i] = sc.nextInt();
        // }

        // int Q = sc.nextInt();
        // while(Q>0){
        //     int s = sc.nextInt();
        //     int e = sc.nextInt();
        //     int v = sc.nextInt();
        //     Q--;
        //     for(int i = s ; i<=e ; i++){
        //         A[i] += v;
        //     }
        // }

        int[] diff = new int[N + 1]; 
        int Q = sc.nextInt();
        while (Q > 0) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int v = sc.nextInt();

            diff[s] += v; 
            if (e + 1 < N) {
                diff[e + 1] -= v; 
            }
            Q--;
        }

        
        // int cSum = 0;
        // for (int i = 0; i < N; i++) {
        //     cSum += diff[i];
        //     A[i] += cSum;
        // }

        // System.out.println(Arrays.toString(A));

        for(int i = 1 ; i<N ; i++){
            diff[i] += diff[i-1];
            System.out.print(diff[i]+" ");
        }
        sc.close();
    }
}
