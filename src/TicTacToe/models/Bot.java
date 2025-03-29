package TicTacToe.models;

public class Bot extends Player {
    private BotDifficultyLevel difficulty;

    public Bot(String name, char symbol, BotDifficultyLevel difficulty) {
        super(name, symbol, PlayerType.BOT);
        this.difficulty = difficulty;
    }
}
