package seminar;

public class Position {
    int position;

    public Position(int position) throws IllegalArgumentException {
        if (position < 0) throw new IllegalArgumentException("위치는 0보다 작을 수 없습니다");
        this.position = position;
    }

    public Position moved() {
        return new Position(position + 1);
    }
}
