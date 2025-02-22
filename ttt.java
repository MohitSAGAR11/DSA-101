

class Gamme {
    Board board;
    char CP;

    public void Game() {
        board = new Board();
        CP = 'X';
    }

    public void Start(){
        System.out.println("Welcome");
      //  Scanner s = new Scanner(System.in);
        board.display();

        while(true){
            System.out.println(CP+"it's your turn");
            // int row = s.nextInt();
            // int col = s.nextInt();

            
        }
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
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '_') {
                return true;
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '_') {
                return true;
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '_') {
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '_') {
            return true;
        }
        return false;
    }

    boolean checkmove(int row, int col){
        return row<3 && col<3 && row>=0 && col>=0 && board[row][col] != '-' ;        
    }

}

public class ttt {
    public static void main(String[] args) {
        
    }
}
