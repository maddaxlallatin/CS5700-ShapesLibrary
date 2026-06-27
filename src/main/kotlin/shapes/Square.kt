package shapes

class Square(topLeft: Point, bottomRight: Point) : Rectangle(topLeft, bottomRight) {
 init {
     require(height() == width())
 }
}