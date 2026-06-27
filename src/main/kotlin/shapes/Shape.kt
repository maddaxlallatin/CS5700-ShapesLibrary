package shapes
abstract class Shape {

    abstract fun getPoints(): List<Point>

    abstract fun move(dx: Double, dy: Double)
}
