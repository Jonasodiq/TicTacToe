import java.util.Arrays;
import java.util.Scanner;

public class GameBoard {
    String[] board = new String[9];
    Player p1;
    Player p2;
    Scanner input = new Scanner(System.in);

    // Const
    public GameBoard(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        resetBoard(); // Temp
        showBoard(); // Temp
    }

    // Metod show Board
    private void showBoard() {
        System.out.println("\n  Current\n Game board");
        for (int i = 0; i < 9; i += 3) {
            System.out.println(" " + board[i] + " | " + board[i + 1] + " | " + board[i + 2]);
            if (i < 6) { // Bara 2 rad
                System.out.println("---+---+---");
            }
        }
        System.out.println();
    }

    // Metod resetBoard
    public void resetBoard() { // Lägg till nummer från 1 till 9
        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);
        }
    }



}

/*TODO Pseudokod

   # GameBoard
    - board []
    - p1
    - p2
    - sc
    + startGame()
    + showBoard()
    + resetBoard()
 */