package tictactoe;

import org.junit.Test;
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


}
