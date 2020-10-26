// Nika Dalivalovi davaleba 3

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    val first: Point = Point(x = 5, y = 4)

    val second: Point = Point(x = 4, y = 10)


    println("რომელი წერტილის გადაადგილება გსურთ? (1 / 2)")
    val movepoint = scan.nextInt()
    if (movepoint == 1) {
        println("რამდენი ერთეულით x-ის გადატანა გსურთ?")
        first.xn = scan.nextInt()
        println("რამდენი ერთეულით y-ის გადატანა გსურთ?")
        first.yn = scan.nextInt()
        first.move_x()
        first.move_y()
        println("წერტილი გადაადგილდა ამ კოორდინატებზე:")
        println(first)
    }
    else if (movepoint == 2) {
        println("რამდენი ერთეულით x-ის გადატანა გსურთ?")
        second.xn = scan.nextInt()
        println("რამდენი ერთეულით y-ის გადატანა გსურთ?")
        second.yn = scan.nextInt()
        second.move_x()
        second.move_y()
        println("წერტილი გადაადგილდა ამ კოორდინატებზე:")
        println(second)
    }
    else {
        println("შეყვანილი წერტილი არ არსებობს...")
    }


}


class Point(private var x: Int, private var y: Int) {

    var xn: Int = 0
    var yn: Int = 0


    override fun toString(): String {
        return "x = $x / y = $y "
    }

    fun move_x() {
        x = x + xn
    }

    fun move_y() {
        y = y + yn
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if (x == other.x && y == other.y) {
                return true
            }
        }
        return false
    }
}