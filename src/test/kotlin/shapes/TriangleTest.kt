package shapes

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotSame

class TriangleTest {

    @Test
    fun getAreaRightTriangle() {
        val triangle = Triangle(Point(0.0, 0.0), Point(4.0, 0.0), Point(0.0, 3.0))
        assertDouble(6.0, triangle.getArea())
    }

    @Test
    fun getAreaIsInvariantToVertexOrder() {
        val triangleA = Triangle(Point(0.0, 0.0), Point(4.0, 0.0), Point(0.0, 3.0))
        val triangleB = Triangle(Point(0.0, 3.0), Point(0.0, 0.0), Point(4.0, 0.0))
        assertDouble(triangleA.getArea(), triangleB.getArea())
    }

    @Test
    fun collinearPointsThrowOnConstruction() {
        assertFailsWith<IllegalArgumentException> {
            Triangle(Point(0.0, 0.0), Point(1.0, 1.0), Point(2.0, 2.0))
        }
    }

    @Test
    fun moveTranslatesAllVertices() {
        val triangle = Triangle(Point(0.0, 0.0), Point(4.0, 0.0), Point(0.0, 3.0))
        triangle.move(1.0, 2.0)
        val points = triangle.getPoints()
        assertDouble(1.0, points[0].x)
        assertDouble(2.0, points[0].y)
        assertDouble(5.0, points[1].x)
        assertDouble(2.0, points[1].y)
        assertDouble(1.0, points[2].x)
        assertDouble(5.0, points[2].y)
    }

    @Test
    fun getPointsReturnsThreeClones() {
        val pointA = Point(0.0, 0.0)
        val pointB = Point(4.0, 0.0)
        val pointC = Point(0.0, 3.0)
        val triangle = Triangle(pointA, pointB, pointC)
        val points = triangle.getPoints()
        assertEquals(3, points.size)
        assertNotSame(pointA, points[0])
        assertNotSame(pointB, points[1])
        assertNotSame(pointC, points[2])
    }
}
