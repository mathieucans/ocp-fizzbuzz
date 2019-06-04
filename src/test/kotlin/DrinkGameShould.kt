import org.assertj.core.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource


class DrinkGameShould {
    @ParameterizedTest
    @CsvSource("1, 1", "2, 2", "3, fizz", "5, buzz", "15, fizzbuzz", "7, bang")
    fun say_the_number(number:Int, say:String) {
        Assertions.assertThat(FizzBuzz(
            number, QuEstCeQueTuDis()).say()).isEqualTo(say)
    }
}
