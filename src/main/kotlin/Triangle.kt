import kotlin.math.abs

class Triangle(pointA: Point, pointB: Point, pointC: Point) : Shape() {
    var pointA: Point = pointA
        private set
    var pointB: Point = pointB
        private set
    var pointC: Point = pointC
        private set

    override fun getPoints(): List<Point> = listOf(pointA, pointB, pointC)

    override fun move(dx: Double, dy: Double) {
        pointA.move(dx, dy)
        pointB.move(dx, dy)
        pointC.move(dx, dy)
    }

    fun getArea(): Double {
        val twiceArea = pointA.x * (pointB.y - pointC.y) +
            pointB.x * (pointC.y - pointA.y) +
            pointC.x * (pointA.y - pointB.y)
        return abs(twiceArea) / 2.0
    }
}