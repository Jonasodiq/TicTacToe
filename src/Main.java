import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Player p1 = new Player("Per", "X");
        Player p2 = new Player("Bosse", "O");
        GameBoard game = new GameBoard(p1, p2);


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
    + printBoard()

   # Main

 */