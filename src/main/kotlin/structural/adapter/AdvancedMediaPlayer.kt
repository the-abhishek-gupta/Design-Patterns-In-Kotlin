package org.example.structural.adapter

class AdvancedMediaPlayer {

    fun playVLC(fileName :String) {
        println("playing VLC $fileName")
    }
    fun playMP4(fileName :String) {
        println("playing MP4 $fileName")
    }
}