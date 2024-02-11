package rockpaperscissors.service;

import org.junit.jupiter.api.Test;
import rockpaperscissors.dto.GameResult;

import static org.junit.jupiter.api.Assertions.*;

class GameServiceTest {
    GameService sut = new GameService();

    @Test
    public void testPlayerWins() {
        assertEquals(GameResult.PLAYER, sut.calculateGameResult("Scissors", "Rock"));
        assertEquals(GameResult.PLAYER, sut.calculateGameResult("Rock", "Paper"));
        assertEquals(GameResult.PLAYER, sut.calculateGameResult("Paper", "Scissors"));
    }

    @Test
    public void testComputerWins() {
        assertEquals(GameResult.COMPUTER, sut.calculateGameResult("Paper", "Rock"));
        assertEquals(GameResult.COMPUTER, sut.calculateGameResult("Scissors", "Paper"));
        assertEquals(GameResult.COMPUTER, sut.calculateGameResult("Rock", "Scissors"));
    }

    @Test
    public void testDraw() {
        assertEquals(GameResult.DRAW, sut.calculateGameResult("Rock", "Rock"));
        assertEquals(GameResult.DRAW, sut.calculateGameResult("Paper", "Paper"));
        assertEquals(GameResult.DRAW, sut.calculateGameResult("Scissors", "Scissors"));
    }
}