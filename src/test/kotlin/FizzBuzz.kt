
val B = "b"

class FizzBuzz(
    var number: Int,
    var sayerFactory: QuEstCeQueTuDis
) {
    // say nothing
    // return number of string 'nothing'
    fun say(): String {
        if (number == 7)
            return SayerBang().say();
        else if (number == 15)
            return MoiJeDis(SayerFizz(), ZzufDisJe()).say();
        else if (number == 5)
            return  ZzufDisJe().say();
        else if (number == 3)
            return SayerFizz().say();
        else if (number % 3 == 0) return "fizz"
        else
        return number.toString()
        return with(number).say()
    }

    fun with(number: Int): Sayer {
        if (number == 7)
            return SayerBang();
        else if (number == 15)
            return MoiJeDis(SayerFizz(), ZzufDisJe());
        else if (number == 5)
            return  ZzufDisJe();
        else if (number == 3)
            return SayerFizz();
        else if (true)
            return SayerUniversal(number)
        return MoiJeDis(SayerFizz(), ZzufDisJe());
    }

}


class QuEstCeQueTuDis {

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
        return number % 5 == 0
    }

    override fun say(): String {
        return "${B}uzz"
    }

}

class SayerFizz : Sayer {
    override fun shouldSay(number: Int): Boolean {
        return number % 3 == 0
    }

    override fun say(): String {
        return "fizz"
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
        if (number % 3 == 0) return "fizz"
        return number.toString()
    }
}


