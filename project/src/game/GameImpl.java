package game;

import java.util.ArrayList;
import java.util.Collection;

public class GameImpl implements Game{
  private final int size;
  private Grid grid;
  private PieceColour player;

  public GameImpl(int size) {
    this.size = size;
    this.grid = new GridImpl(size); // Instanced by GridImpl
    this.player = PieceColour.WHITE; // White first

  }

  @Override
  public boolean isOver(){
    // True if the game is over
    // The game is over when there is a winner or there are no more moves (a draw)
    if ( getMoves().isEmpty() || winner()!= PieceColour.NONE)
      return true;
    
    return false;

  }

  @Override
  // The colour of the winner.
  public PieceColour winner() {
    // Use the PathFinder class to determine the winner
    boolean tbRoad = PathFinder.topToBottom(grid, currentPlayer());
    boolean lrRoad = PathFinder.leftToRight(grid, currentPlayer());
    if (tbRoad || lrRoad ){
      return currentPlayer();
    }

    // Should return PieceColour.NONE if the game is not over
    // Should also return PieceColour.NONE if the game is a draw
    return PieceColour.NONE;
  }

  @Override
  // The colour of the current player (the player who will make the next move)
  // If the game is over, the output will be the last winner
  public PieceColour currentPlayer(){ 
    return player;
  }

  @Override
  // Gets a Collection of all valid moves for the current player
  public Collection<Move> getMoves(){
    Collection<Move> moveList = new ArrayList<>();
    for (int i=0; i<size; i++){
      for (int j=0; j<size; j++){
        if ( grid.getPiece(i, j) == PieceColour.NONE){
          moveList.add(new MoveImpl(i,j));
        }
      }
    } 
    return moveList;

  }

  @Override  
  // Executes a move for the current player
  public void makeMove(Move move){

    // Make sure that only one thread can modify the chessboard state at a time.
    synchronized (this) {
      if(!isOver()){
      // Throws an IllegalArgumentException if the move is invalid
        // An invalid move is one where the position is already occupied 
        if (grid.getPiece(move.getRow(), move.getCol())!= PieceColour.NONE) {
        throw new IllegalArgumentException(
          String.format("Position(%d, %d) already occupied!", move.getRow(), move.getCol())
            );
        }

        // Or the position is out of bounds
        try {
          // Updates the internal game state to reflect the move
            grid.setPiece(move.getRow(), move.getCol(), player);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid move:" + e.getMessage());
        }

      // Check if the game is over, after every move
        if (!isOver()){
          // Changes the current player to the other colour after the move is made
          player = (player == PieceColour.WHITE) ? PieceColour.BLACK : PieceColour.WHITE;
        } 

      // If the game is over, will throws an IllegalArgumentException for any move after this.
      } else {
          throw new IllegalArgumentException(
            String.format("Game was over! The winner was %s", winner())
          );
      }
    }
  }
  
  @Override
  // Returns a copy of the grid
  // Note that this is should be a deep copy
  public Grid getGrid(){
    return grid.copy();
  }

  @Override
  // Returns a copy of the game
  // Note that this is should be a deep copy
  // Which means that the game returned should be a new object
  // And there is no way to modify the internal state of the this game
  // by modifying the game returned
  public Game copy(){
    GameImpl copyGame = new GameImpl(this.grid.getSize());
    copyGame.grid = this.getGrid();
    copyGame.player = this.player;

    return copyGame;
  }

}
