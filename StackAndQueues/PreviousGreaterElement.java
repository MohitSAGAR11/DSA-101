package StackAndQueues;

import java.util.Stack;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        
    }

    public static int[] findPreviousGreaterElements(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] result = new int[arr.length];
        for(int i = 0 ; i< arr.length ; i++){
            while(!st.empty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.empty()){
                result[i] = -1;
            } else if(st.peek() > arr[i]){
                result[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return result;
    }

    public static int[] indexOfPreviousGreaterElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] result = new int[arr.length];
        for(int i = 0 ; i< arr.length ; i++){
            while(!st.empty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            if(st.empty()){
                result[i] = -1;
            } else if(st.peek() > arr[i]){
                result[i] = st.peek();
            }
            st.push(i);
        }
        return result;
    }

    public static int[] distanceOfPreviousGreaterElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] result = new int[arr.length];
        for(int i = 0 ; i< arr.length ; i++){
            while(!st.empty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            if(st.empty()){
                result[i] = -1;
            } else if(st.peek() > arr[i]){
                result[i] = st.peek() - i;
            }
            st.push(i);
        }
        return result;
    }
}
