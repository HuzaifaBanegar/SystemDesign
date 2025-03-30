package TicTacToe.factories;

import TicTacToe.strategies.gameWinningStrategy.GameWinningStrategy;
import TicTacToe.strategies.gameWinningStrategy.OrderOneGameWinningStrategy;

public class GameWinningStrategyFactory {
    public static GameWinningStrategy getGameWinningStrategy(String strategy, int size) {
        switch (strategy) {
            case "ORDERONE":
                return new OrderOneGameWinningStrategy(size);
            default:
                return new OrderOneGameWinningStrategy(size);
        }
    }
}
