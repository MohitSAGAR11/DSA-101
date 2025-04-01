package Recursion;

import java.util.Stack;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String s = "abccbk";
        System.out.println(removeConsecutiveDuplicates(s));
    }

    
    public static String removeConsecutiveDuplicates(String s) {
       Stack<Character> st = new Stack<>();
       for(char ch : s.toCharArray()){
           if(st.isEmpty() || st.peek() != ch){
               st.push(ch);
           }else{
               st.pop();
           }
       }
       StringBuilder sb = new StringBuilder();
       while(!st.isEmpty()){
           sb.append(st.pop());
       }
       return sb.reverse().toString();
    }
}
