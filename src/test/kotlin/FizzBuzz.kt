
val B = "b"

private val FOO = "fizz"

class FizzBuzz(
    var number: Int,
    var sayerFactory: QuEstCeQueTuDis
) {
    // say nothing
    // return number of string 'nothing'
    fun say(): String {
        if (number == 7)
            return "${B}${SayerBang().CoNcAtEnAtEANG()}";
    else if (number == 15)
        return MoiJeDis(SayerFizz(), ZzufDisJe()).say();
    else if (number == 5)
            return  ZzufDisJe().say();
            else if (number == 3)
                return SayerFizz().say();
            else if (number % 3 == 0) return FOO
    else
        return number.toString()
            var result: Sayer?

            if (number == 15)
                result = MoiJeDis(SayerFizz(), ZzufDisJe());
            else if (number == 5)
                result = ZzufDisJe();
            else if (number == 3)
                result = SayerFizz();
            else if (true)
                result = SayerUniversal(number)
            else result = MoiJeDis(SayerFizz(), ZzufDisJe())

        return result.say()
    }

    }


class QuEstCeQueTuDis {

}

class SayerBang {

    fun CoNcAtEnAtEANG() = "ang"

    fun shouldSay(number: Int): Boolean {
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

private val BAR = "${B}uzz"

class ZzufDisJe : Sayer {
    override fun shouldSay(number: Int): Boolean {
        return number % 5 == 0
    }

    override fun say(): String {
        return BAR
    }

}

class SayerFizz : Sayer {
    override fun shouldSay(number: Int): Boolean {
        return number % 3 == 0
    }

    override fun say(): String {
        return FOO
    }

}

private fun mult(a: Int, b: Int) = b % a == 0

interface Sayer {
    fun say(): String
    fun shouldSay(number: Int): Boolean
}

class SayerUniversal(val number: Int) : Sayer {
    override fun shouldSay(number: Int): Boolean {
        return true
    }

    override fun say(): String {
        if (number % 3 == 0) return FOO
        return number.toString()
    }
}


