package Recursion;

import java.util.ArrayList;

public class GreyCodeArray {
    public static void main(String[] args) {
        //N(no of digits) generates greycode sequence of N digits
        //return arrayList of strings of greycodes
        int N = 5;
        System.out.println(greyCode(new int[N], 0));

    }

    static ArrayList<String> greyCode(int[] arr, int index) {
        if (index == arr.length) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> left = greyCode(arr, index + 1);
        ArrayList<String> right = greyCode(arr, index + 1);
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < left.size(); i++) {
            result.add("0" + left.get(i));
        }
        for (int i = right.size() - 1; i >= 0; i--) {
            result.add("1" + right.get(i));
        }
        return result;
    }
}
