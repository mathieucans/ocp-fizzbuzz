class FizzBuzzFactory {
    fun create(number: Int): SayOne {
        return SayOne()
    }

}

class SayOne
{
    fun say(): String{
        return "1"
    }
}

