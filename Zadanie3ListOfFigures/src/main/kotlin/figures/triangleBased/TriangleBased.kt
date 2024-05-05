package figures.triangleBased

import figures.ThreeDimensFigure
import kotlin.math.sqrt

abstract class TriangleBased (private val a: Float, private val b: Float, private val c: Float) : ThreeDimensFigure {
    override fun baseArea() : Float{
        val p = (a + b + c) / 2
        return sqrt(p * (p - a) * (p - b) * (p - c))
    }
}