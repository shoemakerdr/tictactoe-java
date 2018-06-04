package tictactoe;

public class Space implements Comparable<Space> {
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

    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }

    @Override
    public int compareTo(Space space) {
        if (x != space.x)
            return Integer.compare(x, space.x);
        return Integer.compare(y, space.y);
    }
}
