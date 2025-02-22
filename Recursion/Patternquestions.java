package Recursion;

public class Patternquestions {
    public static void main(String[] args) {
        printTriangle(4, 0);
    }

    static void printTriangle(int numRows, int currentRow) {
        if (numRows == 0) {
            return;
        }

        if (currentRow < numRows) {
            printTriangle(numRows, currentRow + 1);
            System.out.print("*");
        } else {
            printTriangle(numRows - 1, 0);
            System.out.println();
        }
    }
}
