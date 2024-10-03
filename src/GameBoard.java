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
        printBoard(); // Temp
    }

    // Metod
    private void printBoard() {
        System.out.println("\nCurrent game board");
        for (int i = 0; i < 9; i += 3) {
            System.out.println(" 1 | 2 | 3");
            if (i < 6) { // Bara 2 rad
                System.out.println("---+---+---");
            }
        }
        System.out.println();
    }


}


/*TODO Pseudokod

   # GameBoard
    - board []
    - p1
    - p2
    - sc
    + startGame()
    + printBoard()
 */