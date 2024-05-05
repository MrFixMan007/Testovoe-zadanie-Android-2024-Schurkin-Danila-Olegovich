package news

import news.models.NewsPost

data class NewsPoster (val name: String = "News Poster") : Subject{

    private val listOfNewsPosts = mutableListOf<NewsPost>()
    private val listOfObservers = mutableListOf<Observer>()

    override fun registerObserver(observer: Observer) {
        if (!listOfObservers.contains(observer))
            listOfObservers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        listOfObservers.remove(observer)
    }

    // активная доставка данных от субъекта
    override fun notifyObservers() {
        listOfObservers.forEach { it.update(listOfNewsPosts.last())}
    }

    override fun removeAllObservers() {
        listOfObservers.clear()
    }

    fun addPostAndNotifyObservers(newsPost: NewsPost){
        listOfNewsPosts.add(newsPost)
        notifyObservers()
    }
}