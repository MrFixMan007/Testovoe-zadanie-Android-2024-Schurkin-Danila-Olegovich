package news

import news.models.NewsPost

data class Subscriber(val name: String = "Subscriber") : Observer, DisplayElement{

    private var newsPost: NewsPost? = null

    override fun update(newsPost: NewsPost) {
        this.newsPost = newsPost
        display()
    }

    override fun display() {
        println("$this: \nПришла новость!\n ${newsPost!!.title}! \n ${newsPost?.text}")
    }

}
