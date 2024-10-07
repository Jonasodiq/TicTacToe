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

        if (winner.equals("draw")) {
            System.out.println("It's a draw! 🤝");
        } else {
            Player winningPlayer = winner.equals(p1.getSymbol()) ? p1 : p2;
            System.out.println("Congratulations! 🎉 " + winningPlayer.getName() + " has won! 🏆");
            winningPlayer.addScore();
        }

        // Display the total wins of both players
        System.out.println(p1.getName() + "'s score: " + p1.getScore());
        System.out.println(p2.getName() + "'s score: " + p2.getScore());
    }

     /* TODO resetBoard */
    // Reset the game board / link-> https://www.w3schools.com/java/ref_string_valueof.asp
    public void resetBoard() { // Add numbers from 1 to 9
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

     /* TODO checkWinner */
    /* link-> https://www.w3schools.com/java/java_arrays_multi.asp
       link-> https://www.geeksforgeeks.org/multidimensional-arrays-in-java/ */
    public String checkWinner() {
        String[][] winConditions = {
            {board[0], board[1], board[2]},
            {board[3], board[4], board[5]},
            {board[6], board[7], board[8]},
            {board[0], board[3], board[6]},
            {board[1], board[4], board[7]},
            {board[2], board[5], board[8]},
            {board[0], board[4], board[8]},
            {board[2], board[4], board[6]}
        };

        for (String[] condition : winConditions) {
            if (condition[0].equals(condition[1]) && condition[1].equals(condition[2])) {
                return condition[0]; // Return the winner
            }
        }

        /* link-> https://www.w3schools.com/java/java_lambda.asp
           link-> https://www.w3schools.com/java/ref_string_matches.asp */
        if (Arrays.stream(board).noneMatch(s -> s.matches("\\d"))) { // match between 0 and 9
            return "draw"; // oavgjort
        }
        return null;
    }

    /* TODO getUserInput */
    public int getUserInput() {
        try {
            int numInput = in.nextInt();
            if (numInput > 0 && numInput <= 9) {
                return numInput;
            } else {
                System.out.println("Invalid input! Please enter a number between 1 and 9 🔢:");
            }
        } catch (InputMismatchException e) { // link-> https://www.w3schools.com/java/java_try_catch.asp
            System.out.println("Invalid input! Please enter a valid number 🔢:");
            in.next(); // Clear invalid input
        }
        return -1;
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