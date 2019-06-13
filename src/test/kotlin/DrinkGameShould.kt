import org.assertj.core.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource


class DrinkGameShould {
    @ParameterizedTest
    @CsvSource(
        "1, 1",
        "2, 2")
    fun say_the_number(number:Int, say:String) {
        assertThat(FizzBuzzFactory().create(number).say()).isEqualTo(say)
    }
}
