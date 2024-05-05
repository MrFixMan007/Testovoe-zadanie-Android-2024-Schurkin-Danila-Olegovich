import figures.circleBased.Cone
import figures.circleBased.Cylinder
import figures.circleBased.Sphere
import figures.rectangleBased.Parallelepiped
import figures.rectangleBased.RectanglePyramid
import figures.triangleBased.TrianglePrism
import figures.triangleBased.TrianglePyramid

fun main() {
    val con = Cone(3f, 5f)
    val cylinder = Cylinder(3f, 5f)
    val sphere = Sphere(3f)

    val parallelepiped = Parallelepiped(3f, 2f, 1f)
    val cube = Parallelepiped(3f, 3f, 3f)
    val rectanglePyramid = RectanglePyramid(3f, 3f, 3f)

    val trianglePrism = TrianglePrism(3f, 4f, 5f, 6f)
    val trianglePyramid = TrianglePyramid(3f, 4f, 5f, 6f)

    val listOfCircleBased = listOf(con, cylinder, sphere)

    val listOfRectangleBased = listOf(parallelepiped, cube, rectanglePyramid)

    val listOfTriangleBased = listOf(trianglePrism, trianglePyramid)

    val listOfThreeDimensFigures = listOf(con, cylinder, sphere, parallelepiped, cube, rectanglePyramid, trianglePyramid, trianglePrism)

    val listOfListsOfFigures = listOf(listOfCircleBased, listOfTriangleBased, listOfRectangleBased)

    listOfThreeDimensFigures.forEach { println("$it | volume = ${it.volume()} base area = ${it.baseArea()}") }
    println()
    listOfListsOfFigures.forEach { x -> x.forEach { println(it) }}
}