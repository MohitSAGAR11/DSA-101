package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSumInArray {
    public static void main(String[] args) {
        int[] A = {3,1,2};
        ArrayList<Integer> SubsetSum = new ArrayList<>();
        subsetSum(A, 0, 0, SubsetSum);
        Collections.sort(SubsetSum);
        System.out.println(SubsetSum);
    }

    public static void subsetSum(int[] A, int index, int sum , ArrayList<Integer> SubsetSum){
        if(index == A.length){
            SubsetSum.add(sum);
            return;
        }

        subsetSum(A, index + 1, sum + A[index], SubsetSum); //include, index, sum, SubsetSum);
        subsetSum(A, index + 1, sum, SubsetSum);
    }
}


