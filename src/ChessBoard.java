public class ChessBoard {

    /**
     * The chessboard. An array of characters representing pieces. Capital chars are black, lowercase is white
     */
    private char[][] board;

    /**
     * Default constructor - Initializes the 2D chessboard array
     */
    public ChessBoard(){
        board = new char[][]{{'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'},
                {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
                {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'},
                {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'},
                {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'},
                {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'},
                {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
                {'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'}};
    }

    /**
     * Checks for a win on the current board
     * @return A string for who won, white or black, or no for no win yet
     */
    public String checkWin(){
        boolean whiteKing = false;
        boolean blackKing = false;

        // check the board for either king
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if (this.board[i][j] == 'k'){
                    whiteKing = true;
                }
                else if (this.board[i][j] == 'K'){
                    blackKing = true;
                }
            }
        }

        if (whiteKing && !blackKing){
            return "White";
        }
        else if (blackKing && !whiteKing){
            return "Black";
        }
        return "No";
    }
}