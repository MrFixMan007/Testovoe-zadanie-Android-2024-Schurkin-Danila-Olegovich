package figures.circleBased

import figures.ThreeDimensFigure
import kotlin.math.PI

abstract class CircleBased (private val r: Float) : ThreeDimensFigure {
    override fun baseArea(): Float {
        return (PI * r * r).toFloat()
    }
}