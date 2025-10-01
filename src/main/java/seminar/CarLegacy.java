package seminar;

import java.util.Random;

public class CarLegacy {
    final String name;
    int position = 0;

    public CarLegacy(String name, int position) throws IllegalArgumentException {
        if (name.isBlank()) throw new IllegalArgumentException("이름은 공백일 수 없습니다");
        if (position < 0) throw new IllegalArgumentException("위치는 0보다 작을 수 없습니다");
        this.name = name;
        this.position = position;
    }

    void move() {
        Random random = new Random();
        int randomNumber = random.nextInt(9) + 1;

        if (randomNumber >= 4) {
            position++;
        }
    }
}
