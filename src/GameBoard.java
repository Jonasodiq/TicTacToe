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

        String winner = null;
        showBoard();
        while (winner == null) {
            System.out.println(currentPlayer.getName() + "'s turn " + currentPlayer.getSymbol() + ". Choose a number 😊:");

            int numInput = getUserInput();
            if (numInput == -1) continue; // Handle invalid input - Hantera ogiltig inmatning

            if (board[numInput - 1].equals(String.valueOf(numInput))) { // check if it is available?
                board[numInput - 1] = currentPlayer.getSymbol(); // Place current player's symbol
                showBoard(); // Print updated game plan
                winner = checkWinner();
                if (winner == null) {
                switchPlayer(); // Switch turn after each valid move - Byt tur efter varje giltigt drag
                }
            } else {
                System.out.println("This spot is already taken. Please choose another! ⚠️");
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