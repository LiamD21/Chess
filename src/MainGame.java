import com.sun.tools.javac.Main;

public class MainGame {

    private char turn;

    public MainGame(){
        turn = 'w';
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

    public static void main(String[] args){
        // create a new board object

    }
}
