class Point(x: Double, y: Double) : Shape() {

    var x: Double = x
        private set
    var y: Double = y
        private set

    override fun getPoints(): List<Point> = listOf(this)

    override fun move(dx: Double, dy: Double) {
        x += dx
        y += dy
    }

    fun clone(): Point = Point(x, y)
}
