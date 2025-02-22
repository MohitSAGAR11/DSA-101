import java.util.Scanner;

class Game {
    Board board;
    char CP; // Current Player
    int moveCount; // Count of moves

    
    public Game(int size) {
        board = new Board(size);
        CP = 'X';
        moveCount = 0;
    }

    public void start() {
        System.out.println("Welcome to Tic-Tac-Toe!");
        Scanner scanner = new Scanner(System.in);
        board.display();

        while (true) {
            System.out.println(CP + ", enter row and column (0-based): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            //  if move is valid
            if (!board.Move(row, col)) {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            // Make the move
            board.board[row][col] = CP;
            moveCount++; 
            board.display();

            
            if (moveCount >= board.size + 1 && board.WIN(row, col, CP)) {
                System.out.println("Congratulations! Player " + CP + " wins!");
                break;
            }

            
            if (board.Full()) {
                System.out.println("It's a draw!");
                break;
            }

          
            CP = (CP == 'X') ? 'O' : 'X';
        }
        scanner.close();
    }
}

class Board {
    char[][] board;
    int size;

    public Board(int size) {
        this.size = size;
        board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';
            }
        }
    }

    void display() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean WIN(int row, int col, char player) {
        boolean RW = true, CW = true, DW = true, ADW = true;

        for (int i = 0; i < size; i++) {
            // row
            if (board[row][i] != player) {
                RW = false;
            }
            //  column
            if (board[i][col] != player) {
                CW = false;
            }
            //  main diagonal
            if (board[i][i] != player) {
                DW = false;
            }
            //  anti-diagonal
            if (board[i][size - i - 1] != player) {
                ADW = false;
            }
        }
        return RW || CW || DW || ADW;
    }

    boolean Move(int row, int col) {
        return row >= 0 && row < size && col >= 0 && col < size && board[row][col] == '-';
    }

    boolean Full() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}

public class tttOPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter board size : ");
        int size = scanner.nextInt();
        Game game = new Game(size);
        game.start();
        scanner.close();
    }
}
