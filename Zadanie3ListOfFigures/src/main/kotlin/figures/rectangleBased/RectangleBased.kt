package figures.rectangleBased

import figures.ThreeDimensFigure

abstract class RectangleBased (private val a: Float, private val b: Float) : ThreeDimensFigure{
    override fun baseArea(): Float {
        return a * b
    }
}