package seminar;

import java.util.Random;

public class RandomNumberMoveStrategy implements MoveStrategy{
    private final Random random = new Random();
    @Override
    public boolean canMove() {
        int randomNumber = random.nextInt(9) + 1;
        return randomNumber >= 4;
    }
}
