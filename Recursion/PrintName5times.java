package Recursion;

public class PrintName5times {
    public static void main(String[] args) {
        Name(0, "Fuck you");
    }

    public static void Name(int i,String n){
        if(i>4){
            return;
        }
        System.out.println(n);
        i++;
        Name(i, n);
    }
}
