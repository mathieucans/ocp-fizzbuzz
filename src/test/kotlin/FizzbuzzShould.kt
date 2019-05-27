import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream


class FizzbuzzShould {
    @ParameterizedTest
    @MethodSource("sayTheNumberCollection")
    fun say_the_number(number:Int, say:String) {
        Assertions.assertEquals(say, "jkl")
    }

    companion object {
        @JvmStatic
        fun sayTheNumberCollection(): Stream<Arguments> {
            return Stream.of(Arguments.of(1, "1"))
        }
    }
}
