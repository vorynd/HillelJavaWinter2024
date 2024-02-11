package rockpaperscissors.dto;

public class Player {
    private String name;
    private int numberOfGames;
    private int numberOfWins;

    private int numberOfLoses;

    private int numberOfTies;

    public Player(String name) {
        this.name = name;
    }

    public void incrementNumberOfGames() {
        numberOfGames++;
    }

    public void incrementNumberOfWinGames() {
        numberOfWins++;
    }

    public void incrementNumberOfLoses() {
        numberOfLoses++;
    }

    public void incrementNumberOfTies() {
        numberOfTies++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public int getNumberOfLoses() {
        return numberOfLoses;
    }

    public int getNumberOfTies() {
        return numberOfTies;
    }
}
