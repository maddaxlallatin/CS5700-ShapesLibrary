class Square(topLeft: Point, bottomRight: Point) : Rectangle(topLeft, bottomRight) {
 init {
     val length: Double = bottomRight.x - topLeft.x
     val width: Double = topLeft.y - bottomRight.y
     require(length == width)
 }
}