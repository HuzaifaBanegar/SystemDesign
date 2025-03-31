package TicTacToe.models;

import TicTacToe.factories.BotPlayingStrategyFactory;
import TicTacToe.strategies.botPlayingStrategy.BotPlayingStrategy;

public class Bot extends Player {
    private BotDifficultyLevel difficulty;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(String name, char symbol, BotDifficultyLevel difficulty) {
        super(name, symbol, PlayerType.BOT);
        this.difficulty = difficulty;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategyByDifficulty(difficulty);
    }

    public Move decideMove(Board board) {
        return botPlayingStrategy.decideMove(this, board);
    }
}
