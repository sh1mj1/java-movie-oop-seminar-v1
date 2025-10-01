package seminar;

public class Car {
    private final String name;
    private final Position position;
    private final MoveStrategy moveStrategy;

    public Car(String name, Position position, MoveStrategy moveStrategy) {
        if (name.isBlank()) throw new IllegalArgumentException("이름은 공백일 수 없습니다");
        this.name = name;
        this.position = position;
        this.moveStrategy = moveStrategy;
    }

    public Car moved() {
        if (moveStrategy.canMove()) {
            return new Car(name, position.moved(), moveStrategy);
        }
        return this;
    }
}
