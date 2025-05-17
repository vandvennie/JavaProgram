package game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GameImpl implements Game{
  private final int size;
  private Grid grid;
  private int round = 1;

  public GameImpl(int size) {
    this.size = size;
    this.grid = new GridImpl(size); // Instanced by GridImpl
  }
    @Override
    // True if the game is over
    // The game is over when there is a winner or there are no more moves (a draw)
    public boolean isOver(){
      for (int i=0; i<size; i++){
        for (int j=0; j<size; j++){
          if ( grid.getPiece(i, j) != PieceColour.NONE || winner()!= PieceColour.NONE)
            return true;
        }
      }
      return false;

    }

    @Override
    // The colour of the winner.
    // You should use the PathFinder class to determine the winner
    // Should return PieceColour.NONE if the game is not over
    // Should also return PieceColour.NONE if the game is a draw
    public PieceColour winner() {
      PieceColour currentPlayer = currentPlayer();
      boolean tpRoad = PathFinder.topToBottom(grid,currentPlayer);
      boolean lrRoad = PathFinder.leftToRight(grid,currentPlayer);
      if (tpRoad || lrRoad ){
        return currentPlayer;
      }
      return PieceColour.NONE;
    }

    @Override
    // The colour of the current player (the player who will make the next move)
    // If the game is over, the output of this method is undefined
    // That is, it does not matter what this method returns if the game is over
    public PieceColour currentPlayer(){
      if (!isOver()){
        if (round % 2==1){
          return PieceColour.WHITE;
        } else {
          return PieceColour.BLACK;
        }
      }
      return PieceColour.NONE;
    }

    @Override
    // Gets a Collection of all valid moves for the current player
    // See https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html
    // Note that ArrayList implements Collection
    // The collection should be empty if there are no valid moves
    public Collection<Move> getMoves(){
      Collection<Move> moveList = new ArrayList<>();
      if (!isOver()){
        for (int i=0; i<size; i++){
          for (int j=0; j<size; j++){
            if ( grid.getPiece(i, j) == PieceColour.NONE){
              moveList.add(new MoveImpl(i,j));
            }

          }
        }
        return moveList;
      } 
      moveList.clear();
      return moveList;
    }


    // Executes a move for the current player
    // Updates the internal game state to reflect the move
    // Changes the current player to the other colour after the move is made
    // If the game is over, the result of this method is undefined
    // That is, it does not matter what this method does if the game is over
    // Throws an IllegalArgumentException if the move is invalid
    // An invalid move is one where the position is already occupied
    // or the position is out of bounds
    public void makeMove(Move move){
      if (move.getRow() < 0 || move.getRow() >= size || move.getCol() < 0 || move.getCol() >= size) {
          throw new IllegalArgumentException(
            String.format("Move out of bounds: (%d, %d)", move.getRow(), move.getCol())
          );
        }
        grid.setPiece(move.getRow(), move.getCol(), currentPlayer());
        round ++;
      }
    }

    @Override
    // Returns a copy of the grid
    // Note that this is should be a deep copy
    // Which means that the grid returned should be a new object
    // And there is no way to modify the internal state of the game
    // by modifying the grid returned
    public Grid getGrid(){
      return grid.copy();
    }



    // Returns a copy of the game
    // Note that this is should be a deep copy
    // Which means that the game returned should be a new object
    // And there is no way to modify the internal state of the this game
    // by modifying the game returned
    public Game copy(){
      GameImpl copyGame = new GameImpl(this.grid.getSize());
      copyGame.grid = this.getGrid();
      copyGame.round = this.round;
      copyGame.history = new ArrayList<>(this.getMoves());
    }

    public int getSize() {
      return size;
    }
}
