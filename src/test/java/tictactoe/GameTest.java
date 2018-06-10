package tictactoe;

import org.junit.Test;

import static org.junit.Assert.*;


public class GameTest {
    @Test
    public void itCanGetTheNextPiece() {
        Game game = new Game(new Board());
        assertEquals(Piece.O, game.nextPiece());
        assertEquals(Piece.X, game.nextPiece(Piece.O));
    }

    @Test
    public void itCanMakeMoves() {
        Game game = new Game(new Board());
        Space space = new Space(0,0);
        assertEquals(null, game.getSpace(space));
        game.move(space, Piece.X);
        assertEquals(Piece.X, game.getSpace(space));
    }

    @Test
    public void itWillNotAllowMovesOnOccupiedSpaces() {
        Game game = new Game(new Board());
        Space space = new Space(0,0);
        game.move(space, Piece.X);
        game.move(space, Piece.O);
        assertEquals(Piece.X, game.getSpace(space));

    }
}
