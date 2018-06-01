package tictactoe;

public class Space {
    private int x;
    private int y;

    public Space(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Space space = (Space) obj;
        return space.x == x && space.y == y;
    }

    @Override
    public int hashCode() {
        return 31 * (y + x);
    }
}
