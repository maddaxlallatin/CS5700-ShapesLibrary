import kotlin.math.PI
open class Ellipse(center: Point, heightRadius: Double, widthRadius: Double): Shape() {

    var center: Point = center
        private set
    var heightRadius: Double = heightRadius
        private set
    var widthRadius: Double = widthRadius
        private set

    init {
        require(heightRadius > 0.0) { "heightRadius must be positive" }
        require(widthRadius > 0.0) { "widthRadius must be positive" }
    }

    override fun getPoints(): List<Point> = listOf(center)

    override fun move(dx: Double, dy: Double) {
        center.move(dx, dy)
    }

    fun getRadii(): List<Double> = listOf(heightRadius, widthRadius)

    fun getArea(): Double {
        return  PI * heightRadius * widthRadius
    }
}