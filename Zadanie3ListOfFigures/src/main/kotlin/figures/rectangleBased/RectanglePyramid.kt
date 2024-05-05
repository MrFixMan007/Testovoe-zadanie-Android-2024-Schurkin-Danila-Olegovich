package figures.rectangleBased

data class RectanglePyramid (val a: Float, val b: Float, val h: Float) : RectangleBased (a, b) {
    override fun volume(): Float {
        return baseArea() * h / 3
    }
}