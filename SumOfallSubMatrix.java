import java.util.Scanner;

public class SumOfallSubMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int[][] A = new int[N][M];
        for(int i = 0 ; i<N ; i++){
            for(int j = 0 ; j<M ; j++){
                A[i][j] = s.nextInt();
            }
        }
        s.close();
       

    }

   public int SubSum(int[][] A , int c1 , int c2 , int r1 , int r2){
    int N = A.length;
    int M = A[0].length;
    int[][] dp = new int[N][M];
    dp[0][0] = A[0][0];
    //to populate 1st left column
    for(int i = 1 ; i<N; i++){
        dp[i][0] = A[i][0] + dp[i-1][0];
    }
    //to populate ist top row
    for(int j = 1 ; j<M ; j++){
        dp[0][j] = A[0][j-1] + A[0][j];
    }

    //Now to populate middle;
    for(int i = 1 ; i<N ; i++){
        for(int j = 1 ; j<M ; j++){
            dp[i][j] = dp[i-1][j] + dp[i][j-1] + A[i][j] - dp[i-1][j-1];
        }
    }

    int ans = dp[r2][c2];
    //now removing extra sums;
    if(c1>0) ans -= dp[r2][c1-1];
    if(r1>0) ans -= dp[r1-1][c2];
    if(r1>0 && c1>0) ans += dp[r1-1][c1-1];

    return ans;
    
   }
    
    
    
}
