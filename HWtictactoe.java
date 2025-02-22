import java.util.*;

class Board {
    private char[][] board;
    private int size;

    public Board(int size) {
        this.size = size;
        board = new char[size][size];
        ibrd();
    }

    private void ibrd() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';
            }
        }
    }

    void dbrd() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean MM(int row, int col, char player) {
        if (row >= 0 && row < size && col >= 0 && col < size && board[row][col] == '-') {
            board[row][col] = player;
            return true;
        }
        return false;
    }

    public boolean CW(char player) {
        for (int i = 0; i < size; i++) {
            if (CR(i, player) || Ccol(i, player)) {
                return true;
            }
        }

        return CMDia(player) || CMsdi(player);
    }

    private boolean CR(int row, char player) {
        for (int j = 0; j < size; j++) {
            if (board[row][j] != player)
                return false;
        }
        return true;
    }

    private boolean Ccol(int col, char player) {
        for (int i = 0; i < size; i++) {
            if (board[i][col] != player)
                return false;
        }
        return true;
    }

    private boolean CMDia(char player) {
        for (int i = 0; i < size; i++) {
            if (board[i][i] != player)
                return false;
        }
        return true;
    }

    private boolean CMsdi(char player) {
        for (int i = 0; i < size; i++) {
            if (board[i][size - 1 - i] != player)
                return false;
        }
        return true;
    }

    public boolean fullhai() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == '-')
                    return false;
            }
        }
        return true;
    }

}

class Game {
    private Board board;
    private char currentPlayer;

    public Game(int size) {
        board = new Board(size);
        currentPlayer = 'X';
    }

    public void start() {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome");
        board.dbrd();

        while (true) {
            System.out.println(currentPlayer + "its you'r turn");
            System.out.println("enter row and col with 0-index");
            int row = s.nextInt();
            int col = s.nextInt();

            if (board.MM(row, col, currentPlayer)) {
                board.dbrd();
                if (board.CW(currentPlayer)) {
                    System.out.println(currentPlayer + " win's the game");
                    break;
                } else if (board.fullhai()) {
                    System.out.println("it's a draw");
                    break;
                }

                if (currentPlayer == 'X') {
                    currentPlayer = '0';
                } else {
                    currentPlayer = 'X';
                }

            } else {
                System.out.println("Invalid move");
            }
        }
        s.close();
    }

}

public class HWtictactoe {
    public static void main(String[] args) {
        Game game = new Game(3);
        game.start();
    }
}
