import java.util.Scanner;

public class CumilitiveSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        Csum(A);
        s.close();
    }

    public static void Csum(int[] A){
        int N = A.length;
        int sum = 0;
        for(int i = 0  ; i < N ; i++){
            sum += A[i]*((N-i)*(i+1));
        }

        System.out.println(sum);
    }
}
