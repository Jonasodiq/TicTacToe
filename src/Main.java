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

        game.startGame();
    }
}

/*TODO Pseudokod

   # Player
    - name
    - symbol
    - wins
    + getName()
    + getSymbol()
    + addWins()
    + getWins()

   # GameBoard
    - board []
    - p1
    - p2
    - sc
    + startGame()
    + showBoard()

   # Main

 */