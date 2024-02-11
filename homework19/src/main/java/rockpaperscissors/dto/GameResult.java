package rockpaperscissors.dto;

public enum GameResult {
    COMPUTER("Computer wins"),
    PLAYER("Player wins"),
    DRAW("It's a tie!");

    private final String message;

    GameResult(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
