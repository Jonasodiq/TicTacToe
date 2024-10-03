public class Player {
    String name;
    String symbol;
    int wins;

    // Const
    public Player(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
        this.wins = 0;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getWins() {
        return wins;
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

 */
