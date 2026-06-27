import kotlin.math.pow
import kotlin.math.sqrt


class Line(pointA: Point, pointB: Point): Shape() {
    var pointA: Point = pointA
    private set
    var pointB: Point = pointB
    private set


    override fun getPoints(): List<Point> = listOf(pointA, pointB)

    override fun move(dx: Double, dy: Double) {

        pointA.move(dx, dy)
        pointB.move(dx, dy)

    }

    fun getSlope(): Double {
        return (pointB.y - pointA.y )/ (pointB.x - pointA.x)
    }
    fun getLength(): Double {
        return sqrt( (pointB.x - pointA.x).pow(2) + (pointB.y - pointA.y).pow(2))
    }
}