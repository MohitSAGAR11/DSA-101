package Recursion;

public class TowerOfHonoi {

    public static void main(String[] args) {
        int n = 3;
        move(n, 'A', 'B', 'C');
    }

    static void move(int n, char A, char B, char C) {
        if (n == 0) {
            return;
        }
        move(n - 1, A, C, B); // move n - 1 disks A A B C, so they are out of the way
        System.out.println("Move disk " + n + " from rod " + A + " to rod " + B);
        move(n - 1, C, B, A); // move n - 1 disks that we left on C to B
        
    }


    // static void TOH(int n, char from , char to , char aux){
    //     if(n == 1){
    //         System.out.println("Move disk 1 from rod "+from+" to rod "+to);
    //         return;
    //     }
    //     TOH(n-1, from, aux, to);
    //     System.out.println("Move disk "+n+" from rod "+from+" to rod "+to);
    //     TOH(n-1, aux, to, from);

    // }


    
}
