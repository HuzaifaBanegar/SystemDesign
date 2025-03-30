package TicTacToe.strategies.gameWinningStrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Cell;
import TicTacToe.models.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


// O(1) -> Use hashmaps
/*
List of hashmaps for col
List of hashmaps for row
Hashmap for L-R diagonal
Hashmap for R-L diagonal
* */
public class OrderOneGameWinningStrategy implements GameWinningStrategy {
    private List<HashMap<Character, Integer>> rowSymbolCounts = new ArrayList<>();
    private List<HashMap<Character, Integer>> colSymbolCounts = new ArrayList<>();
    private HashMap<Character, Integer> topLeftDiagonalSymbolCounts = new HashMap<>();
    private HashMap<Character, Integer> topRightDiagonalSymbolCounts = new HashMap<>();

    public OrderOneGameWinningStrategy(int size) {
        for(int i = 0; i < size; i++) {
            rowSymbolCounts.add(new HashMap<>());
            colSymbolCounts.add(new HashMap<>());
        }
    }

    private boolean isCellOnTopLeftDiagonal(int row, int col) {
       return row == col;
    }

    private boolean isCellOnTopRightDiagonal(int row, int col, int size) {
        return row + col == size-1;
    }

    @Override
    public boolean isWinning(Board board, Cell cell, Player player) {
        char symbol = cell.getPlayer().getSymbol();
        int row = cell.getRow();
        int col = cell.getCol();
        int size = board.getSize();

        if(rowSymbolCounts.get(row).containsKey(symbol)) {
            rowSymbolCounts.get(row).put(symbol, rowSymbolCounts.get(row).get(symbol) + 1);
        }else{
            rowSymbolCounts.get(row).put(symbol, 0);
        }

        if(colSymbolCounts.get(col).containsKey(symbol)) {
            colSymbolCounts.get(col).put(symbol, colSymbolCounts.get(col).get(symbol) + 1);
        }else{
            colSymbolCounts.get(col).put(symbol, 0);
        }

        if(isCellOnTopLeftDiagonal(row, col)) {
            if(!topLeftDiagonalSymbolCounts.containsKey(symbol)) {
                topLeftDiagonalSymbolCounts.put(symbol, 0);
            }else{
                topLeftDiagonalSymbolCounts.put(symbol, topLeftDiagonalSymbolCounts.get(symbol) + 1);
            }
        }

        if(isCellOnTopRightDiagonal(row, col, size)) {
            if(!topRightDiagonalSymbolCounts.containsKey(symbol)) {
                topRightDiagonalSymbolCounts.put(symbol, 0);
            }else{
                topLeftDiagonalSymbolCounts.put(symbol, topRightDiagonalSymbolCounts.get(symbol) + 1);
            }
        }

        if(rowSymbolCounts.get(row).get(symbol) == size-1 ||
                colSymbolCounts.get(col).get(symbol) == size-1 ) {
            return true;
        }

        if(isCellOnTopLeftDiagonal(row, col) && topLeftDiagonalSymbolCounts.get(symbol) == size-1) {
            return true;
        }

        if(isCellOnTopRightDiagonal(row, col, size) && topRightDiagonalSymbolCounts.get(symbol) == size-1){
            return true;
        }

        return false;

    }
}
