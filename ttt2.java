import java.util.*;

class Gamme {
    Board board;
    char CP; // Current Player

    // Constructor to initialize the game
    public Gamme() {
        board = new Board();
        CP = 'X';
    }

    public void start() {
        System.out.println(" Welcome ");
        Scanner s = new Scanner(System.in);

        board.display(); // Display the initial board

        while (true) {
            System.out.println(CP + "  Enter row and column : ");
            int row = s.nextInt();
            int col = s.nextInt();

            // Check if the move is valid
            if (!board.checkmove(row, col)) {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            // Make the move
            board.board[row][col] = CP;

            board.display();

            if (board.check()) {
                System.out.println("Congratulations! Player " + CP + " wins!");
                break;
            }

            if (board.Fullhai()) {
                System.out.println("It's a draw!");
                break;
            }

            // Switch players
            CP = (CP == 'X') ? 'O' : 'X';
        }

        s.close();
    }
}

class Board {
    char[][] board;

    public Board() {
        board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    void display() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean check() {
        // Check rows and cols
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return true;
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '-') {
                return true;
            }
        }

        // Check dia
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-') {
            return true;
        }

        return false;
    }

    boolean checkmove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }

    boolean Fullhai() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}

public class ttt2 {
    public static void main(String[] args) {
        Gamme game = new Gamme();
        game.start();
    }
}
