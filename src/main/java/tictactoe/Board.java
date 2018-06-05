package tictactoe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Board {
    private Map<Space,Piece> spaces;

    public Board() {
       spaces = new HashMap<>();
       // Fill spaces map
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               spaces.put(new Space(i,j), null);
           }
       }
    }

    public Piece get(Space space) {
        return spaces.get(space);
    }

    public Board place(Space space, Piece piece) {
        spaces.put(space, piece);
        return this;
    }

    public boolean isFull() {
        return !spaces.containsValue(null);
    }

    public List<Space> availableSpaces() {
        return spaces.entrySet()
                .stream()
                .filter(s -> s.getValue() == null)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Board board = (Board) obj;
        return board.spaces.equals(spaces);
    }

    public Board copy() {
        Board boardCopy = new Board();
        boardCopy.spaces = new HashMap<>(spaces);
        return boardCopy;
    }
}

