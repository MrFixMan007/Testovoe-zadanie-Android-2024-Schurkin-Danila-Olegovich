package figures.rectangleBased

data class Parallelepiped(val a: Float, val b: Float, val h: Float) : RectangleBased (a, b) {
    override fun volume(): Float {
        return a * b * h
    }

    fun isCube(): Boolean{
        return (a == b && b == h)
    }
}
