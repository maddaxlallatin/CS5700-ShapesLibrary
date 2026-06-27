package shapes

import kotlin.math.PI
import kotlin.test.Test
import kotlin.test.assertEquals

class CircleTest {

    @Test
    fun getArea() {
        val circle = Circle(Point(0.0, 0.0), 5.0)
        assertDouble(25.0 * PI, circle.getArea())
    }

    @Test
    fun getRadiiAreEqual() {
        val circle = Circle(Point(0.0, 0.0), 5.0)
        assertEquals(listOf(5.0, 5.0), circle.getRadii())
    }

    @Test
    fun moveTranslatesCenter() {
        val circle = Circle(Point(0.0, 0.0), 5.0)
        circle.move(3.0, 4.0)
        val center = circle.getPoints()[0]
        assertDouble(3.0, center.x)
        assertDouble(4.0, center.y)
    }
}
