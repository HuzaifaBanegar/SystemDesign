package TicTacToe.strategies.gameWinningStrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Cell;
import TicTacToe.models.Player;

public interface GameWinningStrategy {
    public boolean isWinning(Board board, Cell cell, Player player);
}
