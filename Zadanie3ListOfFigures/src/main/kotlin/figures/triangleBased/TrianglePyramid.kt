package figures.triangleBased

data class TrianglePyramid(var a: Float, var b: Float, var c: Float, var h: Float) : TriangleBased(a, b, c){
    override fun volume(): Float {
        return baseArea() * h / 3
    }
}
