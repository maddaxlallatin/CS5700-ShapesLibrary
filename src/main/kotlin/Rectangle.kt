open class Rectangle(topLeft: Point, bottomRight: Point): Shape() {
    var topLeft: Point = topLeft
        private set
    var bottomRight: Point = bottomRight
        private set

    init {
        require(bottomRight.x > topLeft.x && topLeft.y > bottomRight.y)
    }

    override fun getPoints(): List<Point> = listOf(topLeft, bottomRight)

    override fun move(dx: Double, dy: Double) {
        topLeft.move(dx, dy)
        bottomRight.move(dx, dy)
    }

    fun getArea(): Double{
        val length: Double = bottomRight.x - topLeft.x
        val width: Double = topLeft.y - bottomRight.y
        return length * width
    }

}