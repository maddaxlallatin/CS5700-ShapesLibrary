package shapes

import kotlin.math.pow
import kotlin.math.sqrt


class Line(pointA: Point, pointB: Point): Shape() {

    private val pointA = pointA.clone()
    private val pointB = pointB.clone()

    init{
        require(pointA.x != pointB.x || pointA.y != pointB.y) {"A line cannot have a length of 0"}
    }

    override fun move(dx: Double, dy: Double) {
        pointA.move(dx, dy)
        pointB.move(dx, dy)
    }


    override fun getPoints(): List<Point> = listOf(pointA.clone(), pointB.clone())

    fun getSlope(): Double {

        require(pointB.x != pointA.x) { "Vertical lines have undefined slope" }

        return (pointB.y - pointA.y )/ (pointB.x - pointA.x)
    }
    fun getLength(): Double {
        return sqrt( (pointB.x - pointA.x).pow(2) + (pointB.y - pointA.y).pow(2))
    }
}