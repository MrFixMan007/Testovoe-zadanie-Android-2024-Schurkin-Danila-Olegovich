package figures.circleBased

data class Cone(val r: Float, val h: Float) : CircleBased(r) {
    override fun volume(): Float {
        return baseArea() * h / 3
    }
}
