package TicTacToe.models;

import TicTacToe.Exceptions.InvalidGameConstructionParameterException;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private Player winner;
    private GameState gameState;
    private int nextPlayerIndex;
    private List<Move> moves;

    private Game() {

    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public void displayBoard() {
        this.board.displayBoard();
    }

    public GameState getGameState() {
        return this.gameState;
    }

    public void makeNextMove() {
        Player toPlay = players.get(nextPlayerIndex);

        System.out.println("Player to move is: "+ toPlay.getName());

        Move move = toPlay.decideMove(board);

        boolean isValidMove = validateMove(move);

        // if the move is valid update the board ,

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        System.out.println("Move is at: "+ row + ", " + col);

        board.getBoard().get(row).get(col).setCellState(CellState.FILLED);
        board.getBoard().get(row).get(col).setPlayer(toPlay);

        // then update the list of move in the moves state
        moves.add(move);

        // then check if it's the winner


        //then increment the nextPlayer index and move on
        nextPlayerIndex++;
        nextPlayerIndex %= players.size();

    }

    public boolean validateMove(Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        return row < board.getSize() && col < board.getSize()
                && row >= 0 && col >= 0
                && move.getCell().getCellState().equals(CellState.EMPTY);
    }


    public static class Builder {
        private Board board;
        private List<Player> players;

        private void validate() throws InvalidGameConstructionParameterException {
            if(this.board.getSize() < 3){
                throw new InvalidGameConstructionParameterException("the size of board cannot be less than 3");
            }

            if(this.players.size() != this.board.getSize()-1){
                throw new InvalidGameConstructionParameterException("the number of players in the game should be atleast board size-1");
            }

        }

        public Game build() throws InvalidGameConstructionParameterException {
            //validations
            validate();

            // Create game
            Game game = new Game();
            game.setBoard(board);
            game.setPlayers(players);
            game.setGameState(GameState.IN_PROGRESS);
            game.setMoves(new ArrayList<>());
            game.setNextPlayerIndex(0);
            return game;
        }

        public Builder setBoard(Board board) {
            this.board = board;
            return this;

        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
    }
}
