package tictactoe;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class BoardTest {
    @Test
    public void itCanQueryTheContentsOfItsSpaces() {
        Board board = new Board();
        assertEquals(null, board.get(new Space(0,0)));
    }

    @Test
    public void itCanPlacePieces() {
        Board board = new Board();
        board.place(new Space(0,0), Piece.X);
        board.place(new Space(1,1), Piece.O);
        assertEquals(Piece.X, board.get(new Space(0,0)));
        assertEquals(Piece.O, board.get(new Space(1,1)));
        assertEquals(null, board.get(new Space(2,2)));
    }

    @Test
    public void itKnowsWhenItIsFull() {
        Board board = new Board();
        board.place(new Space(0,0), Piece.X)
                .place(new Space(0,1), Piece.O)
                .place(new Space(0,2), Piece.X)
                .place(new Space(1,0), Piece.O)
                .place(new Space(1,1), Piece.X)
                .place(new Space(1,2), Piece.O)
                .place(new Space(2,0), Piece.X)
                .place(new Space(2,1), Piece.O);
        assertFalse(board.isFull());
        board.place(new Space(2,2), Piece.X);
        assertTrue(board.isFull());
    }

    @Test
    public void itCanGiveAListOfAvailableSpaces() {
        Board board = new Board();
        board.place(new Space(0,0), Piece.X)
                .place(new Space(0,1), Piece.O)
                .place(new Space(0,2), Piece.X);
        List<Space> expected = Arrays.asList(
                new Space(1,0),
                new Space(1,1),
                new Space(1,2),
                new Space(2,0),
                new Space(2,1),
                new Space(2,2)
        );
        List<Space> actual = board.availableSpaces();
        Collections.sort(actual);
        assertEquals(expected, actual);
    }

}
