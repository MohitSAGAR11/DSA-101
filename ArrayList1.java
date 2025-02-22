import java.util.*;

//DYNAMIC ARRAY(IT  is used whenever you dont know what is the size of the array)
//given an array 
public class ArrayList1 {
    public static void main(String[] args) {
        
        int[] Arr = new int[4];
        
        int Arrsize = 0;
        for(int i=0;i<100;i++){
            Arr = Add(Arr, i, Arrsize);
            Arrsize++;

        }
    

        print(Arr);
    }

    static int[] Add(int[] A, int value, int size) {
        int N = A.length;
        if (N > size) {
            A[size] = value;
            return A;

        }
        int[] newA = new int[N * 2];
        for (int i = 0; i < N; i++) {
            newA[i] = A[i];
        }
        newA[N] = value;
        return newA;

    }

    public static void print(int[] Arr) {
        // for (int i : Arr) {
        // System.out.print(i + " ");

        // }
        System.out.println(Arrays.toString(Arr));
    }
}