package seminar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PositionTest {

    @Test
    @DisplayName("Seminar.Position 이 음수에 위치하게 되면 예외를 발생시킨다.")
    void createPosition_withNegativeValue_throwsIllegalArgumentException() {
        // given
        int negativePosition = -1;

        // when & then
        Assertions.assertThatThrownBy(() -> new Position(negativePosition))
                .isInstanceOf(IllegalArgumentException.class);
    }


    @Test
    @DisplayName("Seminar.Position 이 양수에 위치하게 되면 예외를 발생시키지 않는다.")
    void createPosition_withPositiveValue_not_throwsIllegalArgumentException() {
        // given
        int positivePosition = 1;

        // when & then
        Assertions.assertThatCode(() -> new Position(positivePosition))
                .doesNotThrowAnyException();
    }

    @Test
    @DisplayName("moved 메서드는 현재 위치에서 1 증가된 새로운 Seminar.Position 객체를 반환한다.")
    void moved_returnsNewPositionWithIncrementedValue() {
        // given
        Position currentPosition = new Position(5);

        // when
        Position movedPosition = currentPosition.moved();

        // then
        Assertions.assertThat(movedPosition.position).isEqualTo(6);
    }

    @ParameterizedTest
    @CsvSource(value = {"0,1", "1,2", "10,11"})
    @DisplayName("moved 메서드는 현재 위치에서 1 증가된 새로운 Seminar.Position 객체를 반환한다. (Parameterized)")
    void moved_returnsNewPositionWithIncrementedValue_parameterized(int currentPos, int expectedMovedPos) {
        // given
        Position currentPosition = new Position(currentPos);

        // when
        Position movedPosition = currentPosition.moved();

        // then
        Assertions.assertThat(movedPosition.position).isEqualTo(expectedMovedPos);
    }
}