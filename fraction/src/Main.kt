// Nika Dalivalovi davaleba 3
// shekveca ver gavakete.

fun main() {

    var f1 = Fraction(6F, 10F)

    var f2 = Fraction(5F, 3F)



}

class Fraction(n: Float, d: Float) {

    private var numerator: Float = n
    private var denominator: Float = d

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator / denominator == other.numerator) {
                return true
            }
        }
        return false
    }

    fun sum(other: Any?) {
        if (other is Fraction) {
            var denominator1: Float = denominator * other.denominator
            var numerator1: Float = denominator * other.numerator + other.denominator * numerator
            println("$numerator1/$denominator1")

        }

    }

    fun difference(other: Any?) {
        if (other is Fraction) {
            var denominator1: Float = denominator * other.denominator
            var numerator1: Float = denominator * other.numerator - other.denominator * numerator
            println("$numerator1/$denominator1")
        }
    }

    fun multiplication(other: Any?) {
        if (other is Fraction) {
            var numerator1: Float = numerator * other.numerator
            var denominator1: Float = denominator * other.denominator
            println("$numerator1/$denominator1")
        }
    }

    fun division(other: Any?) {
        if (other is Fraction) {
            var numerator1: Float = denominator * other.numerator
            var denominator1: Float = other.denominator * numerator
            println("$numerator1/$denominator1")
        }
    }
}


