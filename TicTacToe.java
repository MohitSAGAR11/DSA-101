import java.util.Scanner;

class Board {
    private char[][] board;
    private int size;

    public Board(int size) {
        this.size = size;
        board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void Display() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean MOVE(int row, int col, char player) {
        if (row >= 0 && row < size && col >= 0 && col < size && board[row][col] == '-') {
            board[row][col] = player;
            return true;
        }
        return false;
    }

    public boolean checkWin(char player) {
        // Check rows and columns
        for (int i = 0; i < size; i++) {
            if (checkRow(i, player) || checkColumn(i, player))
                return true;
        }
        // Check diagonals
        return checkMainDiagonal(player) || checkSecondaryDiagonal(player);
    }

    private boolean checkRow(int row, char player) {
        for (int j = 0; j < size; j++) {
            if (board[row][j] != player)
                return false;
        }
        return true;
    }

    private boolean checkColumn(int col, char player) {
        for (int i = 0; i < size; i++) {
            if (board[i][col] != player)
                return false;
        }
        return true;
    }

    private boolean checkMainDiagonal(char player) {
        for (int i = 0; i < size; i++) {
            if (board[i][i] != player)
                return false;
        }
        return true;
    }

    private boolean checkSecondaryDiagonal(char player) {
        for (int i = 0; i < size; i++) {
            if (board[i][size - 1 - i] != player)
                return false;
        }
        return true;
    }

    public boolean isFull() {
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
    private char CP;

    public Game(int size) {
        board = new Board(size);
        CP = 'X';
    }

    public void start() {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Tic-Tac-Toe!");
        board.Display();

        while (true) {
            System.out.println("Player " + CP + ", it's your turn!");
            System.out.print("Enter row and column (0-indexed): ");
            int row = s.nextInt();
            int col = s.nextInt();

            if (board.MOVE(row, col, CP)) {
                board.Display();
                if (board.checkWin(CP)) {
                    System.out.println("Player " + CP + " wins!");
                    break;
                }
                if (board.isFull()) {
                    System.out.println("It's a draw!");
                    break;
                }
                CP = (CP == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Invalid move, try again.");
            }
        }

        s.close();
    }
}

public class TicTacToe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("size of game");
        int size = s.nextInt();
        Game game = new Game(size);
        game.start();
        s.close();
    }
}
