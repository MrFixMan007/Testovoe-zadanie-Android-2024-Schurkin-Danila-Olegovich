package news

import news.models.NewsPost

interface Observer {
    fun update(newsPost: NewsPost)
}