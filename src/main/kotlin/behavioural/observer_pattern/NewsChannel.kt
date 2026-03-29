package org.example.behavioural.observer

import org.example.behavioural.observer.observer_interface.IObserver

class NewsChannel {
    private val channels = mutableListOf<IObserver>()
    private var news: String = ""

    fun subscribe(observer: IObserver) {
        channels.add(observer)
    }

    fun unsubscribe(observer: IObserver) {
        channels.remove(observer)
    }

    fun setNews(news: String) {
        this.news = news
        notifyObservers()
    }

    private fun notifyObservers() {
        channels.forEach { it.update(news) }
    }
}