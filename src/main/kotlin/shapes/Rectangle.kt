package shapes

open class Rectangle(topLeft: Point, bottomRight: Point): Shape(), AreaShape {
    private val topLeft = topLeft.clone()
    private val bottomRight = bottomRight.clone()

    protected fun width(): Double = bottomRight.x - topLeft.x
    protected fun height(): Double = topLeft.y - bottomRight.y

    init {
        require(bottomRight.x > topLeft.x && topLeft.y > bottomRight.y) { "Rectangle requires topLeft to be above-left of bottomRight, with positive width and height" }
    }

    override fun getPoints(): List<Point> = listOf(topLeft.clone(), bottomRight.clone())

    override fun move(dx: Double, dy: Double) {
        topLeft.move(dx, dy)
        bottomRight.move(dx, dy)
    }

    override fun getArea(): Double{

        return height() * width()
    }

}