package TicTacToe.strategies.botPlayingStrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Move;
import TicTacToe.models.Player;

public interface BotPlayingStrategy {
    public Move decideMove(Player player, Board board);
}
