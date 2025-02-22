package Recursion;

public class print_itoN {
    public static void main(String[] args) {
        // print(1, 6);
        printRev(6, 1);
    }

    public static void print(int i , int N){
        if(i > N){
            return;
        }
        System.out.println(i);
        i++;
        print(i, N);
    }

    public static void printRev(int N, int i){
        if(N < i){
            return;
        }
        System.out.println(N);
        N--;
        printRev(N, i);
    }
}
