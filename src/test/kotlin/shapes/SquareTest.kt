package shapes

import kotlin.test.Test
import kotlin.test.assertFailsWith

class SquareTest {

    @Test
    fun validSquareConstructs() {
        Square(Point(0.0, 4.0), Point(4.0, 0.0))
    }

    @Test
    fun validSquareArea() {
        val square = Square(Point(0.0, 4.0), Point(4.0, 0.0))
        assertDouble(16.0, square.getArea())
    }

    @Test
    fun nonSquareThrows() {
        assertFailsWith<IllegalArgumentException> {
            Square(Point(0.0, 5.0), Point(4.0, 0.0))
        }
    }

    @Test
    fun movePreservesArea() {
        val square = Square(Point(0.0, 4.0), Point(4.0, 0.0))
        square.move(2.0, 3.0)
        assertDouble(16.0, square.getArea())
    }
}
