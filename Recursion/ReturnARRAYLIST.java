package Recursion;

import java.util.ArrayList;

public class ReturnARRAYLIST {
    public static void main(String[] args) {
        int[] A = {1,1,1,1,1,1,1,1,1,1,1,1,22,3,4,5,666,443};
        System.out.println(findallindex(A, 1, 0, new ArrayList<>()));
    }

    static ArrayList<Integer> findallindex(int[] A, int target , int index,ArrayList<Integer> list){
        if(index == A.length){
            return list;
        }

        if(A[index] == target){
            list.add(index);
        }

        return findallindex(A, target, ++index, list);
    }


    //Return the list but don't take it as an argument;
    static 
}
