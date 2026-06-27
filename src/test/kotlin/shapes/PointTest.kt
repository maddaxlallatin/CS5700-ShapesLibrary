package shapes

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotSame

class PointTest {

    @Test
    fun moveUpdatesCoordinates() {
        val point = Point(1.0, 2.0)
        point.move(3.0, 4.0)
        assertDouble(4.0, point.x)
        assertDouble(6.0, point.y)
    }

    @Test
    fun getPointsReturnsSingleClonedPoint() {
        val point = Point(1.0, 2.0)
        val points = point.getPoints()
        assertEquals(1, points.size)
        assertDouble(1.0, points[0].x)
        assertDouble(2.0, points[0].y)
        assertNotSame(point, points[0])
    }

    @Test
    fun cloneIsIndependentCopy() {
        val point = Point(1.0, 2.0)
        val cloned = point.clone()
        point.move(3.0, 4.0)
        assertDouble(1.0, cloned.x)
        assertDouble(2.0, cloned.y)
    }
}
