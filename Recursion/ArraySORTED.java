package Recursion;

public class ArraySORTED {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,90,67};
        System.out.println(sorted(A, 0));
    }

    public static boolean sorted(int[] A,int index){
        if(index == A.length-1) return true;

        return A[index] < A[index+1] && sorted(A, ++index);

    }
}
