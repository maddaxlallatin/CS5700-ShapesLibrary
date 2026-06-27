class Circle(center: Point, heightRadius: Double, widthRadius: Double): Ellipse(center, heightRadius, widthRadius) {
    init {
        require(heightRadius == widthRadius)
    }
}