public class Player {
    private final String name;
    private final String symbol;
    private int score = 0;

    // Const
    public Player(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getScore() {
        return score;
    }

    public void addScore() {
        score++;
    }
}

/*TODO

   # Player
    - name
    - symbol
    - score
    + getName()
    + getSymbol()
    + getScore()
    + addScore()
 */
