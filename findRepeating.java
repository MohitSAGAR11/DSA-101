import java.util.*;
public class findRepeating {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] A = new int[n];
        for(int i=0; i<n; i++){
            A[i] = s.nextInt();
        }
        System.out.println(Repeating(A));
    }

    public static int Repeating(int[] A){
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<A.length; i++){
            if(set.contains(A[i])){
                return A[i];
            } else {
                set.add(A[i]);
            }
        }
        return -1;
    }
}
