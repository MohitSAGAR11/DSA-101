import java.util.*;

public class SumOFsub {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        SumOFsubArray(A);
        s.close();
    }

    public static void SumOFsubArray(int[] A) {
        int N = A.length;
        for(int i = 0 ; i < N ; i++){
            int sum = 0;
            for(int j = i ; j<N ;j++){
                sum += A[j];
                System.out.println(sum);
            }
            // int j = i;           
            // while(j<N){
            //     sum += A[j];
            //     System.out.println(sum);
            //     j++;
            // }

        }
    }
}
