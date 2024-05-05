package figures.triangleBased

data class TrianglePrism(var a: Float, var b: Float, var c: Float, var h: Float) : TriangleBased(a, b, c) {
    override fun volume(): Float {
        return baseArea() * h
    }
}
