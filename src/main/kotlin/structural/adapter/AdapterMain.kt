package org.example.structural.adapter

class AdapterMain {
    fun main(){
        val player = AudioPlayer()
        player.play(AudioType.MP3, "file1")
        player.play(AudioType.MP4, "file2")
        player.play(AudioType.VLC, "file3")
    }
}