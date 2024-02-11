package rockpaperscissors.service;

import rockpaperscissors.dto.GameResult;
import rockpaperscissors.dto.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class GameService {

    Map<String, GameResult> resultMap;

    public GameService() {
        resultMap = new HashMap<>();
        resultMap.put("RockRock", GameResult.DRAW);
        resultMap.put("PaperPaper", GameResult.DRAW);
        resultMap.put("ScissorsScissors", GameResult.DRAW);
        resultMap.put("RockScissors", GameResult.PLAYER);
        resultMap.put("PaperRock", GameResult.PLAYER);
        resultMap.put("ScissorsPaper", GameResult.PLAYER);
        resultMap.put("ScissorsRock", GameResult.COMPUTER);
        resultMap.put("RockPaper", GameResult.COMPUTER);
        resultMap.put("PaperScissors", GameResult.COMPUTER);
    }

    public String getComputerMove() {
        return convertMove(String.valueOf(new Random().nextInt(3)));
    }

    public String showTextAndGetPlayerMove(Scanner scanner) {
        System.out.println("Please chose Rock Paper or Scissors");
        System.out.println("0. Rock");
        System.out.println("1. Paper");
        System.out.println("2. Scissors");
        System.out.println("press (e) to exit game");
        String playerMove = scanner.nextLine();
        return convertMove(playerMove);
    }

    public GameResult calculateGameResult(String computerMove, String playerMove) {
        return resultMap.get(playerMove + computerMove);
    }

    public void showStats(Player player) {
        System.out.println(player.getName() + " statistics:");
        System.out.println("Total games: " + player.getNumberOfGames());
        System.out.println("Wins: " + player.getNumberOfWins());
        System.out.println("Loses: " + player.getNumberOfLoses());
        System.out.println("Ties: " + player.getNumberOfTies());
    }

    public String convertMove(String move) {
        switch (move) {
            case ("0"), ("Rock") -> {
                return "Rock";
            }
            case ("1"), ("Paper") -> {
                return "Paper";
            }
            case ("2"), ("Scissors") -> {
                return "Scissors";
            }
        }
        return move;
    }
}
