package TicTacToe.models;


import java.util.Scanner;

/*
    3. Player
        - String name
        - Char symbol
        - Enum PlayerType ( Try avoiding boolean )
* */
public class Player {
    private String name;
    private char symbol;
    private PlayerType playerType;
    private Scanner scanner;

    public Player(String name, char symbol, PlayerType playerType) {
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
        this.scanner = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }


    public Move decideMove(Board board) {
        System.out.println("Please enter to row you want to make move in: ");
        int row = scanner.nextInt();
        System.out.println("Please enter to column you want to make move in: ");
        int column = scanner.nextInt();

        Cell currentCell = board.getBoard().get(row).get(column);

        return new Move(currentCell, this);
    }


}
