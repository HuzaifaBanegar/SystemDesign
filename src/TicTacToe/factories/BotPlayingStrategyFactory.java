package TicTacToe.factories;

import TicTacToe.models.BotDifficultyLevel;
import TicTacToe.strategies.botPlayingStrategy.BotPlayingStrategy;
import TicTacToe.strategies.botPlayingStrategy.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyByDifficulty(BotDifficultyLevel difficulty) {
        switch (difficulty){
            case EASY:
                return new RandomBotPlayingStrategy();
            default:
                return new RandomBotPlayingStrategy();
        }
    }
}
