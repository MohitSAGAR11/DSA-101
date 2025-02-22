import java.util.*;

class Board {
    char[][] grid = new char[3][3];

    void brd() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.grid[i][j] = '_';
            }
        }
    }

    void print() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(this.grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean check() {
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2] && grid[i][0] != '_') {
                return true;
            }
            if (grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i] && grid[0][i] != '_') {
                return true;
            }
        }
        if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[0][0] != '_') {
            return true;
        }
        if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0] && grid[0][2] != '_') {
            return true;
        }
        return false;
    }

    boolean checkmove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && grid[row][col] == '_';
    }
}

class Player {
    String name;

    void set(int r, int c, Board b, char symbol) {
        b.grid[r][c] = symbol;
    }
}

public class Vimal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board b = new Board();
        b.brd();
        Player p1 = new Player();
        Player p2 = new Player();
        System.out.println("Enter name of Player 1");
        p1.name = sc.next();
        System.out.println("Welcome " + p1.name + " ! Your moves symbol will be O");
        System.out.println("Enter name of Player 2");
        p2.name = sc.next();
        System.out.println("Welcome " + p2.name + " ! Your moves symbol will be X \nLet's start the game!!!!");
        b.print();
        for (int i = 0; i < 9; i++) {
            Player CP;
            char symbol;
            if (i % 2 == 0) {
                CP = p1;
                symbol = 'O';
            } else {
                CP = p2;
                symbol = 'X';
            }
            while (true) {
                System.out.println(CP.name + ", Enter your row and column:");
                int row = sc.nextInt();
                int col = sc.nextInt();
                if (b.checkmove(row, col)) {
                    CP.set(row, col, b, symbol);
                    break;
                } else {
                    System.out.println("Sahi jagah daal bhai");
                }
            }
            b.print();
            if (b.check()) {
                System.out.println(CP.name + " won!");
                return;
            }
            sc.close();
        }
        System.out.println("It's a draw!");
       
    }
}