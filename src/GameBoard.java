import java.util.Arrays;
import java.util.Scanner;

public class GameBoard {
    private final String[] board = new String[9];
    private final Player p1;
    private final Player p2;
    private Player currentPlayer;
    private final Scanner in = new Scanner(System.in);

    // Const
    public GameBoard(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.currentPlayer = p1;
        resetBoard();
    }

    // Metod start the game
    public void startGame() {
        System.out.println("Player 1: " + p1.getName() + " " + p1.getSymbol());
        System.out.println("Player 2: " + p2.getName() + " " + p2.getSymbol());
        System.out.println("Let the game begin! ⚔️");

        boolean winner = false; // Temp
        if (!winner) {
            switchPlayer();
            showBoard(); // Temp
            System.out.println("Player 1: " + currentPlayer.getName() + " " + currentPlayer.getSymbol());
        }
    }

    // Reset the game board link-> https://www.w3schools.com/java/ref_string_valueof.asp
    public void resetBoard() { // Lägg till nummer från 1 till 9
        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);
        }
    }

    // Method to print the game board
    private void showBoard() {
        System.out.println("\n\t\tTic-Tac-Toe");
        for (int i = 0; i < 9; i += 3) {
            System.out.println("\t\t" + board[i] + " | " + board[i + 1] + " | " + board[i + 2]);
            if (i < 6) { // Bara 2 rad
                System.out.println("\t\t-----------");
            }
        }
    }

    // Method to switch turns between players
    public void switchPlayer() {
        currentPlayer = currentPlayer == p1 ? p2 : p1;
    }



}

/*TODO Pseudokod

   # GameBoard
    - board []
    - p1
    - p2
    - sc
    - currentPlayer
    + startGame()
    + showBoard()
    + resetBoard()
    + switchPlayer()
 */