package news

import news.models.NewsPost
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class NewsPosterTest{

    private val newsPost1 = NewsPost("Найдена новая цивилизация",
        "На обратной стороне Луны были найдены следы зелёных человечков!")

    val newsPost2 = NewsPost("Придумана новая парадигма программирования",
        "В Саратове в СГТУ студенты ввели новую четвёртую парадигму!")

    private var newsPoster = NewsPoster("BBC")

    private val subscriber1 = Subscriber("Олег")
    private val subscriber2 = Subscriber("Николай")
    private val subscriber3 = Subscriber("Василий")

    @BeforeEach
    fun reloadNewsPoster(){
        newsPoster = NewsPoster("BBC")
    }

    @AfterEach
    fun printNewsPost(){
        println()
    }

    @Test
    fun `должен добавить одного наблюдателя`(){
        println("Test 1")
        newsPoster.registerObserver(subscriber1)
        newsPoster.addPostAndNotifyObservers(newsPost1)
    }

    @Test
    fun `при попытке повторного добавления не добавляет`(){
        println("Test 2")
        newsPoster.registerObserver(subscriber1)
        newsPoster.registerObserver(subscriber1)
        newsPoster.addPostAndNotifyObservers(newsPost1)
    }

    @Test
    fun `добавляет троих`(){
        println("Test 3")
        newsPoster.registerObserver(subscriber1)
        newsPoster.registerObserver(subscriber2)
        newsPoster.registerObserver(subscriber3)
        newsPoster.addPostAndNotifyObservers(newsPost1)
    }

    @Test
    fun `добавляет троих и удаляет одного`(){
        println("Test 4")
        newsPoster.registerObserver(subscriber1)
        newsPoster.registerObserver(subscriber2)
        newsPoster.registerObserver(subscriber3)
        newsPoster.removeObserver(subscriber3)
        newsPoster.addPostAndNotifyObservers(newsPost1)
    }

    @Test
    fun `добавляет троих и удаляет всех`(){
        println("Test 5")
        newsPoster.registerObserver(subscriber1)
        newsPoster.registerObserver(subscriber2)
        newsPoster.registerObserver(subscriber3)
        newsPoster.removeAllObservers()
        newsPoster.addPostAndNotifyObservers(newsPost1)
    }

}