package TicTacToe.controllers;

import TicTacToe.Exceptions.InvalidGameConstructionParameterException;
import TicTacToe.models.Board;
import TicTacToe.models.Game;
import TicTacToe.models.GameState;
import TicTacToe.models.Player;

import java.util.List;

public class GameController {

    public Game createGame(int size, List<Player> players, String winningStrategy){
        try {
            return Game.getBuilder()
                    .setSize(size)
                    .setWinningStrategy(winningStrategy)
                    .setPlayers(players).build();
        }catch (InvalidGameConstructionParameterException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void displayBoard(Game game){
        game.displayBoard();
    }

    public GameState getGameState(Game game){
        return game.getGameState();
    }

    public void executeGame(Game game){
        game.makeNextMove();
    }
}
