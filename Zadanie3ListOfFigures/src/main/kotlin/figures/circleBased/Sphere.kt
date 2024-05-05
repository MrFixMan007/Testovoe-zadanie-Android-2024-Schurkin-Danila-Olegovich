package figures.circleBased

data class Sphere(val r: Float) : CircleBased(r) {
    override fun volume(): Float {
        return baseArea() * r * 4 / 3
    }
}
