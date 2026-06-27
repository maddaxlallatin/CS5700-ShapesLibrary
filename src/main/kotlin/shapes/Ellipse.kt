package shapes

import kotlin.math.PI
open class Ellipse(center: Point, private val heightRadius: Double, private val widthRadius: Double): Shape(), AreaShape {

    private val center = center.clone()

    init {
        require(heightRadius > 0.0) { "heightRadius must be positive" }
        require(widthRadius > 0.0) { "widthRadius must be positive" }
    }

    override fun getPoints(): List<Point> = listOf(center.clone())

    override fun move(dx: Double, dy: Double) {
        center.move(dx, dy)
    }


    fun getRadii(): List<Double> = listOf(heightRadius, widthRadius)

    override fun getArea(): Double {
        return  PI * heightRadius * widthRadius
    }
}