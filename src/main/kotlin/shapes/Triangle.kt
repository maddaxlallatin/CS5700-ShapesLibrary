package shapes

import kotlin.math.abs

class Triangle(pointA: Point, pointB: Point, pointC: Point) : Shape(), AreaShape {
    private val pointA = pointA.clone()
    private val pointB = pointB.clone()
    private val pointC = pointC.clone()

    init {
        require( getArea() > 0.0 ) { "Area cannot be 0" }
    }

    override fun getPoints(): List<Point> = listOf(pointA.clone(), pointB.clone(), pointC.clone())

    override fun move(dx: Double, dy: Double) {
        pointA.move(dx, dy)
        pointB.move(dx, dy)
        pointC.move(dx, dy)
    }

    override fun getArea(): Double {
        val twiceArea = pointA.x * (pointB.y - pointC.y) +
            pointB.x * (pointC.y - pointA.y) +
            pointC.x * (pointA.y - pointB.y)
        return abs(twiceArea) / 2.0
    }
}