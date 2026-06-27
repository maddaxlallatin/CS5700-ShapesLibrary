package shapes

import kotlin.math.PI
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class EllipseTest {

    @Test
    fun getArea() {
        val ellipse = Ellipse(Point(0.0, 0.0), 2.0, 3.0)
        assertDouble(PI * 6.0, ellipse.getArea())
    }

    @Test
    fun getRadii() {
        val ellipse = Ellipse(Point(0.0, 0.0), 2.0, 3.0)
        assertEquals(listOf(2.0, 3.0), ellipse.getRadii())
    }

    @Test
    fun zeroHeightRadiusThrows() {
        assertFailsWith<IllegalArgumentException> {
            Ellipse(Point(0.0, 0.0), 0.0, 3.0)
        }
    }

    @Test
    fun zeroWidthRadiusThrows() {
        assertFailsWith<IllegalArgumentException> {
            Ellipse(Point(0.0, 0.0), 2.0, 0.0)
        }
    }
    @Test
    fun moveTranslatesCenter() {
        val ellipse = Ellipse(Point(0.0, 0.0), 2.0, 3.0)
        ellipse.move(1.0, 2.0)
        val center = ellipse.getPoints()[0]
        assertDouble(1.0, center.x)
        assertDouble(2.0, center.y)
    }
}
