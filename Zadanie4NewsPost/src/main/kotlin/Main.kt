import news.NewsPoster
import news.Subscriber
import news.models.NewsPost

fun main() {
    val newsPost = NewsPost("Найдена новая цивилизация",
        "На обратной стороне Луны были найдены следы зелёных человечков!")

    val newsPost1 = NewsPost("Придумана новая парадигма программирования",
        "В Саратове в СГТУ студенты ввели новую четвёртую парадигму!")

    val newsPoster = NewsPoster("BBC")

    val subscriber1 = Subscriber("Олег")
    val subscriber2 = Subscriber("Николай")
    val subscriber3 = Subscriber("Василий")

    newsPoster.addPostAndNotifyObservers(newsPost)
    println()

    newsPoster.registerObserver(subscriber1)

    newsPoster.addPostAndNotifyObservers(newsPost1)
    println()

    newsPoster.registerObserver(subscriber2)
    newsPoster.registerObserver(subscriber2)
    newsPoster.registerObserver(subscriber3)
    newsPoster.removeObserver(subscriber1)
    newsPoster.removeObserver(subscriber1)

    newsPoster.addPostAndNotifyObservers(newsPost)
    println()

    newsPoster.removeAllObservers()
    newsPoster.addPostAndNotifyObservers(newsPost)
    println()
}