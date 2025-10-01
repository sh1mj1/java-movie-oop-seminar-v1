package seminar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void 자동차_이름이_공백이면_예외가_발생한다() {
        assertThatThrownBy(() -> new Car(
                "",
                new Position(0),
                new FakeMoveStrategy(true))
        )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름은 공백일 수 없습니다");
    }

    @Test
    void 자동차는_전진할_수_있다() {
        // given
        Car car = new Car(
                "testCarName",
                new Position(0),
                new FakeMoveStrategy(true));

        // when
        Car movedCar = car.moved();

        // then
        assertThat(movedCar).isNotSameAs(car);
    }
}
