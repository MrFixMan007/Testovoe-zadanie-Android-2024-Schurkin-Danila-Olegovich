package figures.circleBased

data class Cylinder(val r: Float, val h: Float) : CircleBased(r){
    override fun volume(): Float {
        return baseArea() * h
    }
}
