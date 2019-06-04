
val B = "b"

class FizzBuzz(
    var number: Int,
    var sayerFactory: QuEstCeQueTuDis
) {
    // say nothing
    // return number of string 'nothing'
    fun say(): String {
        return sayerFactory.with(number).say()
    }

}


class QuEstCeQueTuDis {
    fun with(number: Int): Sayer {
        return listOf(
            SayerBang(),
            MoiJeDis(SayerFizz(), ZzufDisJe()),
            ZzufDisJe(),
            SayerFizz(),
            SayerUniversal(number)
        ).first { it.shouldSay(number) }
    }
}

class SayerBang : Sayer {
    override fun say(): String {
        return "${B}${CoNcAtEnAtEANG()}"
    }

    private fun CoNcAtEnAtEANG() = "ang"

    override fun shouldSay(number: Int): Boolean {
        return number % 7 == 0
    }

}

class MoiJeDis(val sayerA: Sayer, val sayerB: Sayer) : Sayer {
    override fun say(): String {
        return sayerA.say() + sayerB.say()
    }

    override fun shouldSay(number: Int): Boolean {
        return sayerA.shouldSay(number) && sayerB.shouldSay(number)
    }
}
class ZzufDisJe : Sayer {
    override fun shouldSay(number: Int): Boolean {
        return isMultipleOfFive(number)
    }

    override fun say(): String {
        return "${B}uzz"
    }

    private fun isMultipleOfFive(number: Int) = number % 5 == 0
}

class SayerFizz : Sayer {
    override fun shouldSay(number: Int): Boolean {
        return isMultipleOfThree(number)
    }

    override fun say(): String {
        return "fizz"
    }

    private fun isMultipleOfThree(number: Int) = number % 3 == 0
}

interface Sayer {
    fun say(): String
    fun shouldSay(number: Int): Boolean
}

class SayerUniversal(val number: Int) : Sayer {
    override fun shouldSay(number: Int): Boolean {
        return true
    }

    override fun say(): String {
        if (number % 3 == 0) return "fizz"
        return number.toString()
    }
}


