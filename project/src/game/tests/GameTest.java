package game.tests;

import java.util.Collection;
import game.*;

public class GameTest extends Test {
    public static void main(String[] args) throws InterruptedException {
        boolean caught = false;
        try {
            new GameImpl(0);
        } catch (IllegalArgumentException e) {
            caught = true;
        }
        expect(true, caught);

        caught = false;
        try {
            new GameImpl(5);
        } catch (IllegalArgumentException e) {
            caught = true;
        }
        expect(false, caught);


    //Creat a new game, test game initalization
        System.out.println("==== Test initalization ====");
        Game game = new GameImpl(5);
        expect(PieceColour.WHITE, game.currentPlayer());
        expect(25, game.getMoves().size());
        expect(false, game.isOver());

    // Test for makeing a move
        System.out.println("==== Test make a move ====");
        Move move = new MoveImpl(0,0);
        game.makeMove(move);
        expect(24, game.getMoves().size());
        expect(PieceColour.NONE, game.winner());
        expect(false, game.isOver());

        // After every move, current player should be changed
        expect(PieceColour.BLACK, game.currentPlayer());


        // Test error catch
        System.out.println("==== Test error catch ====");
        // Test for occupation
        try{
            game.makeMove(new MoveImpl(0, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected occupation error: " + e.getMessage());
            caught = true;
        }
        expect(true, caught);
            // After a fail move, current player should not be changed
        expect(PieceColour.BLACK, game.currentPlayer());

        // Test for moving out of bounds
        try{
            game.makeMove(new MoveImpl(0,5));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected boundary error: " + e.getMessage());
            caught = true;
        }
        expect(true, caught);
            // After a fail move, current player should not be changed
        expect(PieceColour.BLACK, game.currentPlayer());

    // Test deep copy this game
        System.out.println("==== Test deep copy ====");
        Game copyGame = game.copy();
        Collection<Move> copyMove =copyGame.getMoves();
        Collection<Move> oriMove =game.getMoves();

        // Compare if two move collections are same
        boolean same = copyMove.toString().equals(oriMove.toString());
        expect(true, same);

        // Make a move on copyGame
        System.out.println("1. Make a move on copyGame");

        copyGame.makeMove(new MoveImpl(1,1));

        // Origin game shouldn't be modified
        expect(24, game.getMoves().size());
        expect(PieceColour.NONE, game.getGrid().getPiece(1, 1));
        expect(PieceColour.NONE, game.winner());
        expect(false, game.isOver());

        // Make a move on original Game
        System.out.println("2. Make a move on original Game");

        game.makeMove(new MoveImpl(1,2));

        // Origin game shouldn't be modified
        expect(23, copyGame.getMoves().size());
        expect(PieceColour.BLACK, copyGame.getGrid().getPiece(1, 1));
        expect(PieceColour.NONE, copyGame.winner());
        expect(false, copyGame.isOver());

    // Make a couple of moves, test winner and game over
        System.out.println("==== Test win ====");
        GameImpl gameWin = new GameImpl(3);
        expect(PieceColour.WHITE, gameWin.currentPlayer());
        gameWin.makeMove(new MoveImpl(0, 0)); // W
        gameWin.makeMove(new MoveImpl(1, 0)); // B
        gameWin.makeMove(new MoveImpl(0, 1)); // W
        gameWin.makeMove(new MoveImpl(1, 1)); // B
        gameWin.makeMove(new MoveImpl(0, 2)); // W wins

        expect(PieceColour.WHITE, gameWin.winner());
        expect(true, gameWin.isOver());


        // Make one more move after the game over
        try{
            game.makeMove(new MoveImpl(1,4));
        } catch (IllegalArgumentException e) {
            System.out.println("Cannot make any move. " + e.getMessage());
        }

    // Test a draw
        System.out.println("==== Test a draw ====");
        GameImpl gameDraw = new GameImpl(3);
        gameDraw.makeMove(new MoveImpl(0, 0)); // W
        gameDraw.makeMove(new MoveImpl(0, 1)); // B
        gameDraw.makeMove(new MoveImpl(0, 2)); // W
        gameDraw.makeMove(new MoveImpl(1, 1)); // B
        gameDraw.makeMove(new MoveImpl(1, 0)); // W
        gameDraw.makeMove(new MoveImpl(1, 2)); // B
        gameDraw.makeMove(new MoveImpl(2, 1)); // W
        gameDraw.makeMove(new MoveImpl(2, 0)); // B
        gameDraw.makeMove(new MoveImpl(2, 2)); // W

        // The collection should be empty if there are no valid moves
        expect(true, gameDraw.getMoves().isEmpty());  
        expect(true, gameDraw.isOver());
        expect(PieceColour.NONE, gameDraw.winner()); // a draw


    // Tread and concurrrency test
        System.out.println("==== Test tread and concurrrency ====");
        int size = 3;
        GameImpl trGame = new GameImpl(size);
        Thread[] threads = new Thread[size * size];
        int index = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                final int row = i;
                final int col = j;
                threads[index] = new Thread(() -> {
                    try {
                        trGame.makeMove(new MoveImpl(row, col));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Caught expected error at (" + row + "," + col + "): " + e.getMessage());
                    }
                });
                index++;
            }
        }

        for (Thread t : threads) t.start();
        for (Thread t : threads) t.join();

        System.out.println("Game state after concurrent moves:");
        System.out.println(trGame.getGrid());// Call GridImpl class .toString()
        System.out.println("The winner is " + trGame.winner());

        checkAllTestsPassed();
    }
}
