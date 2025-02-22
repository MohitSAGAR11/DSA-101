public class RemovingIndex {

    public class Solution {
        public int solve(int[] A) {
            int N = A.length;
    
            int[] Esum = new int[N];
            int[] Osum = new int[N];
            int cur = 0;
            int cur1 = 0;
            for(int i = 0 ; i<N ; i++){
                if(i % 2 == 1){
                    cur += A[i];
                    Esum[i] = cur;
                } else {
                    Esum[i] = Esum[i-1];
                }
    
                if(i % 2 == 0){
                    cur1 += A[i];
                    Osum[i] = cur1;
                } else {
                    Osum[i] = Osum[i-1];
                }         
            }
            int c  = 0;
        for(int i = 0 ; i<N ; i++){
            int oddsum = Osum[i] + Esum[N-1] - Esum[i];
            int evensum = Esum[i] + Osum[N-1] - Osum[i];

            if(oddsum == evensum){
                c++;
            }
        }
    
            
    
    
        }
    }
    
}
