package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] A = {1,2,4,56,889,4211,4,4,4};
        // System.out.println(LS(A, 0, 889));
        // System.out.println(FindIndex(A,0,889));
        findAllindex(A, 0, 4);
        System.out.println(List);
    }

    static boolean LS(int[] A,int index,int target){
        if(index == A.length - 1) return false;

        return A[index] == target || LS(A, ++index, target) ;
    }

    static int FindIndex(int[] A, int index , int target){
        if(index == A.length-1) return -1;

        if(A[index] == target) return index;

        return FindIndex(A,++index,target);
    }

    static ArrayList<Integer> List = new ArrayList<>();
    static void findAllindex(int[] A,int index , int target){
        
        if(index == A.length){
            return;
        }

        if(A[index] == target){
            List.add(index);
        }

        findAllindex(A, ++index, target);
    }
}
