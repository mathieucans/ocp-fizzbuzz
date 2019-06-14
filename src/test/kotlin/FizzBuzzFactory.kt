class FizzBuzzFactory {
    fun create(number: Int): Say {
        return SayAll(listOf(
            Couple(3, SayFizz()),
            Couple(5, SayBuzz()),
            Couple(7, SayBang())
        ).filter{ it.predicate(number)}
            .map{ it.say}
            .ifEmpty {listOf(SayIdentity(number)) })
    }


}

class SayBang : Say {
    override fun say(): String {
        return "bang"
    }

}

class SayAll(val filter: List<Say>) : Say {
    override fun say(): String {
        return filter.map { it.say() }.reduce { acc, say ->  acc + say}
    }

}

class SayFizzBuzz : Say {
    override fun say(): String {
        return "fizzbuzz"
    }

}

class Couple(val modulo: Int, val say: Say) {
    fun predicate(number: Int): Boolean {
        return number % modulo == 0
    }

}

interface Say {
    fun say(): String
}

class SayIdentity(val number:Int) : Say {

    override fun say(): String {
        return number.toString()
    }
}

class SayFizz : Say {
    override fun say(): String {
        return "fizz"
    }
}
class SayBuzz : Say {
    override fun say(): String {
        return "buzz"
    }
}

