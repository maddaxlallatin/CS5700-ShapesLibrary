package shapes

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotSame

class LineTest {

    @Test
    fun getLengthHorizontal() {
        val line = Line(Point(0.0, 0.0), Point(3.0, 0.0))
        assertDouble(3.0, line.getLength())
    }

    @Test
    fun getLength345Triangle() {
        val line = Line(Point(0.0, 0.0), Point(3.0, 4.0))
        assertDouble(5.0, line.getLength())
    }

    @Test
    fun getSlope() {
        val line = Line(Point(0.0, 0.0), Point(2.0, 4.0))
        assertDouble(2.0, line.getSlope())
    }

    @Test
    fun getSlopeOnVerticalLineThrows() {
        val line = Line(Point(1.0, 0.0), Point(1.0, 5.0))
        assertFailsWith<IllegalArgumentException> {
            line.getSlope()
        }
    }

    @Test
    fun zeroLengthLineThrowsOnConstruction() {
        assertFailsWith<IllegalArgumentException> {
            Line(Point(1.0, 2.0), Point(1.0, 2.0))
        }
    }

    @Test
    fun moveTranslatesBothEndpoints() {
        val line = Line(Point(0.0, 0.0), Point(3.0, 0.0))
        line.move(1.0, 2.0)
        val points = line.getPoints()
        assertDouble(1.0, points[0].x)
        assertDouble(2.0, points[0].y)
        assertDouble(4.0, points[1].x)
        assertDouble(2.0, points[1].y)
    }

    @Test
    fun getPointsReturnsClones() {
        val pointA = Point(0.0, 0.0)
        val pointB = Point(3.0, 4.0)
        val line = Line(pointA, pointB)
        val points = line.getPoints()
        assertNotSame(pointA, points[0])
        assertNotSame(pointB, points[1])
    }
}
