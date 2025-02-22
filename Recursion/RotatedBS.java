package Recursion;
public class RotatedBS {
    public static void main(String[] args) {
        int[] A = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(RBS(A, target, 0, A.length - 1));
    }

    static int RBS(int[] A , int target , int s , int e){
        if(s > e) return -1;
        int mid =  s + (e-s)/2;

        if(A[mid] == target) return mid;

        if(A[s] <= A[mid]){
            if(target >=  A[s] && target <= A[mid]){
                return RBS(A, target, s, mid-1);
            } else {
                return RBS(A,target,mid+1,e);
            }
        }

        if(target >= A[mid] && target <= A[e]){
            return RBS(A,target,mid+1,e);
        } 

        return RBS(A,target,s,mid-1);
    }
}
