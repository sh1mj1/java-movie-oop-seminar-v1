package seminar;

import java.util.Random;

public class PremiumMoveStrategy implements MoveStrategy {
    private final Random random = new Random();

    @Override
    public boolean canMove() {
        int randomNumber = random.nextInt(10);
        return randomNumber >= 2;
    }
}
