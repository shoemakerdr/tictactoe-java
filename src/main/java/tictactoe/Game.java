package tictactoe;

public class Game {
    Board board;
    Piece currentPiece;

    public Game(Board board) {
        this.board = board;
        this.currentPiece = Piece.X;
    }

    public Game(Board board, Piece piece) {
        this.board = board;
        this.currentPiece = piece;
    }

    public Piece nextPiece() {
        return nextPiece(currentPiece);
    }

    public Piece nextPiece(Piece piece) {
        return piece == Piece.X ? Piece.O : Piece.X;
    }

    public Piece getSpace(Space space) {
        return board.get(space);
    }

    public boolean canMakeMove(Space space, Piece piece) {
        return board.get(space) == null;
    }

    public Game move(Space space, Piece piece) {
        if (canMakeMove(space, piece))
            board.place(space, piece);
        return this;
    }
}
