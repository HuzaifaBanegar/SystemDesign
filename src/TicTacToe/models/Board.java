package TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> board;

    public Board(int size) {
        this.board = new ArrayList<>();
        this.size = size;

        for(int i=0; i<size; i++) {
            this.board.add(new ArrayList<>());
            for(int j=0; j<size; j++) {
                this.board.get(i).add(new Cell(i, j));
            }
        }
    }

    public int getSize() {
        return size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void displayBoard() {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if(board.get(i).get(j).getCellState().equals(CellState.EMPTY)){
                    System.out.printf("|   |");
                }else{
                    System.out.printf("| "+ board.get(i).get(j).getPlayer().getSymbol() +" |");
                }
            }
            System.out.println("\n");
        }
    }
}
