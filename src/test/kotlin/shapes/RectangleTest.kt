package shapes

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotSame

class RectangleTest {

    @Test
    fun getArea() {
        val rectangle = Rectangle(Point(0.0, 4.0), Point(5.0, 0.0))
        assertDouble(20.0, rectangle.getArea())
    }

    @Test
    fun getAreaFor4By3Rectangle() {
        val rectangle = Rectangle(Point(0.0, 3.0), Point(4.0, 0.0))
        assertDouble(12.0, rectangle.getArea())
    }

    @Test
    fun invalidWidthThrows() {
        assertFailsWith<IllegalArgumentException> {
            Rectangle(Point(5.0, 4.0), Point(0.0, 0.0))
        }
    }

    @Test
    fun invalidHeightOrderThrows() {
        assertFailsWith<IllegalArgumentException> {
            Rectangle(Point(0.0, 0.0), Point(5.0, 4.0))
        }
    }

    @Test
    fun moveTranslatesBothCorners() {
        val rectangle = Rectangle(Point(0.0, 4.0), Point(5.0, 0.0))
        rectangle.move(1.0, 1.0)
        val points = rectangle.getPoints()
        assertDouble(1.0, points[0].x)
        assertDouble(5.0, points[0].y)
        assertDouble(6.0, points[1].x)
        assertDouble(1.0, points[1].y)
    }

    @Test
    fun getPointsReturnsTwoClones() {
        val topLeft = Point(0.0, 4.0)
        val bottomRight = Point(5.0, 0.0)
        val rectangle = Rectangle(topLeft, bottomRight)
        val points = rectangle.getPoints()
        assertEquals(2, points.size)
        assertNotSame(topLeft, points[0])
        assertNotSame(bottomRight, points[1])
    }
}
