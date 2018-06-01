package tictactoe;

import java.util.HashMap;
import java.util.Map;

public class Board {
    Map<Space,Piece> spaces;

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

    public void place(Space space, Piece piece) {
        spaces.put(space, piece);
    }
}

