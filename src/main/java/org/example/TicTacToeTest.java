package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    private TicTacToe game;

    @BeforeEach
    public void setUp() {
        game = new TicTacToe();
    }

    @Test
    public void testSwitchCurrentPlayer() {
        game.switchCurrentPlayer();
        assertEquals('O', game.getCurrentPlayer().getMarker()); // Positive Test
    }

    @Test
    public void testSwitchCurrentPlayerNegative() {
        game.switchCurrentPlayer();
        assertNotEquals('X', game.getCurrentPlayer().getMarker()); // Negative Test
    }

    @Test
    public void testHasWinner() {
        game.getBoard().place(0, 0, 'X');
        game.getBoard().place(0, 1, 'X');
        game.getBoard().place(0, 2, 'X');
        assertTrue(game.hasWinner()); // Positive Test
    }

    @Test
    public void testHasWinnerNegative() {
        game.getBoard().place(0, 0, 'X');
        game.getBoard().place(0, 1, 'O');
        game.getBoard().place(0, 2, 'X');
        assertFalse(game.hasWinner()); // Negative Test
    }
}
