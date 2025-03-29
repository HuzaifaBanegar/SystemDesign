package TicTacToe;

import TicTacToe.controllers.GameController;
import TicTacToe.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameController gameController = new GameController();

        System.out.println("*********** Welcome to Tic-Tac-Toe! **************");
        System.out.println("Enter the size of the game board");

        int size = scanner.nextInt();
        System.out.println("Is there a bot in the game? (Y/N)");

        String isBotInput = scanner.next();
        if(!isBotInput.toUpperCase().equals("Y") && !isBotInput.toUpperCase().equals("N")) {
            throw new IllegalArgumentException("Invalid input");
        }

        List<Player> players = new ArrayList<>();

        int playersToBeAdd = size-1;

        if (isBotInput.toUpperCase().equals("Y")) {
            playersToBeAdd -= 1;
        }

        for (int i = 0; i < playersToBeAdd; i++) {
            int playerNumber = i+1;
            System.out.println("Enter the name of the player "+playerNumber+": ");
            String playerName = scanner.next();

            System.out.println("Enter the symbol for "+playerName+": ");
            char playerSymbol = scanner.next().charAt(0);

            players.add(new Player(playerName, playerSymbol, PlayerType.HUMAN));
        }

        if(isBotInput.toUpperCase().equals("Y")) {
            System.out.println("Enter the name of the bot: ");
            String botName = scanner.next();
            System.out.println("Enter the symbol of the bot: ");
            char botSymbol = scanner.next().charAt(0);
            players.add(new Bot(botName, botSymbol, BotDifficultyLevel.EASY));
        }

        Game game = gameController.createGame(size, players);

        // I want to check the game status continuously
        // If I have it in progress
        // I will continue

        while(gameController.getGameState(game).equals(GameState.IN_PROGRESS)){
            System.out.println("This is your current board: ");
            gameController.displayBoard(game);
            gameController.executeGame(game);

            game.setGameState(GameState.ENDED);
        }



    }
}
