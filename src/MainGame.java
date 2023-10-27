import com.sun.tools.javac.Main;

import java.util.Scanner;

public class MainGame {

    private char turn;
    private ChessBoard board;

    public MainGame(){
        turn = 'w';
        board = new ChessBoard();
    }

    /**
     * Changes turn between white and black
     */
    private void endTurn(){
        if (this.turn == 'w'){
            this.turn = 'b';
        }
        else if (this.turn == 'b'){
            this.turn = 'w';
        }
    }

    private String[] getMove(){
        Scanner sc = new Scanner(System.in);
        String[] move = new String[3];

        // Print move prompt
        if (this.turn == 'w'){
            System.out.println("Enter White's Move: ");
        }
        else if (this.turn == 'b'){
            System.out.println("Enter Black's Move: ");
        }

        // get move from console
        String input = sc.nextLine();

        // interpret move
        move[0] = input.substring(0, input.length() - 2);
        move[1] = input.substring(input.length()-2, input.length()-1);
        move[2] = input.substring(input.length()-1);

        return move;
    }

    public static void main(String[] args) {
        // create a new game
        MainGame instance = new MainGame();
        String[] move = instance.getMove();
        System.out.println(move[0]);
        System.out.println(move[1]);
        System.out.println(move[2]);
    }
}
