// 2 oct 2024 Jonas N. Individuell Uppgift-TicTacToe
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the name of Player 1 (X):");
        Player p1 = new Player(sc.nextLine(), "(X)");

        System.out.println("\nEnter the name of Player 2 (O):");
        Player p2 = new Player(sc.nextLine(), "(O)");

        GameBoard game = new GameBoard(p1, p2);

        boolean playAgain = true;
        while (playAgain) {
            game.startGame();
            System.out.println("Would you like to play again? (y/n): \uD83D\uDD04");
            String response = sc.nextLine().toLowerCase();
            playAgain = response.equals("y"); // https://www.w3schools.com/java/ref_string_equals.asp
            if (playAgain) {
                game = new GameBoard(p1, p2); // Start a new game
            }
        }
        sc.close();
    }
}

/*TODO Pseudokod

   # Main
    - sc
    - ask for name p1, p2
    - create p1, p2 and save with name and symbol
    - create new game and run
 */