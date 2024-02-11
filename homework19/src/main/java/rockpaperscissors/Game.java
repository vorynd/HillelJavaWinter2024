package rockpaperscissors;

import rockpaperscissors.dto.GameResult;
import rockpaperscissors.dto.Player;
import rockpaperscissors.service.GameService;

import java.util.Scanner;

public class Game {
    Player player;
    Integer gameCount;
    Scanner scanner = new Scanner(System.in);
    GameService gameService = new GameService();

    public void start() {
        System.out.println("Welcome Rock Paper Scissors : 2024");
        System.out.println("Please enter you name : ");
        player = new Player(scanner.nextLine());
        enterNumberOfGames();
        play();
    }

    public void enterNumberOfGames() {
        System.out.println(player.getName() + ": Please enter number of games [more then 0]: ");
        try {
            gameCount = Integer.valueOf(scanner.nextLine());
        } catch (NumberFormatException exception) {
            System.out.println("must be number");
            enterNumberOfGames();
        }
        if (gameCount <= 0) {
            System.out.println("must be > 0");
            enterNumberOfGames();
        }
    }

    public void play() {
        for (int i = 0; i < gameCount; i++) {
            System.out.println("Game " + (i + 1) + " of " + gameCount);
            String playerMove = gameService.showTextAndGetPlayerMove(scanner);
            while (!playerMove.equals("Rock") && !playerMove.equals("Paper") && !playerMove.equals("Scissors")) {
                if (playerMove.equals("e")) {
                    gameService.showStats(player);
                    return;
                }
                playerMove = gameService.showTextAndGetPlayerMove(scanner);
            }
            player.incrementNumberOfGames();
            String computerMove = gameService.getComputerMove();
            System.out.println("Player " + player.getName() + " choses " + playerMove);
            System.out.println("Computer choses " + computerMove);
            GameResult result = gameService.calculateGameResult(computerMove, playerMove);
            switch (result) {
                case DRAW -> player.incrementNumberOfTies();
                case PLAYER -> player.incrementNumberOfWinGames();
                case COMPUTER -> player.incrementNumberOfLoses();
            }
            System.out.println("Result: " + result.getMessage());
            System.out.println("------------------");
        }
        gameService.showStats(player);
    }
}
