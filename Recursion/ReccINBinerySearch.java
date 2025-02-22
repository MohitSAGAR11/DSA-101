package Recursion;

public class ReccINBinerySearch {
    public static void main(String[] args) {
        int[] A = new int[]{1,2,3,4,5,6,7,8,9,10};
        int index = BS()
    }

    public static int BS(int[] A , int target , int s , int e){
        if(s > e) return -1;

        int mid = s + (e-s)/2;

        if(A[mid] == target) return mid;

        if(A[mid] > target) return BS(A,target,s,mid - 1);

        return BS(A,target,mid + 1,e);
    }
}
