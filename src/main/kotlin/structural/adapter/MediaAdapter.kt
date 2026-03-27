package org.example.structural.adapter

class MediaAdapter(private val advancedMediaPlayer: AdvancedMediaPlayer) : MediaPlayer{
    override fun play(audioType: AudioType, filename: String) {
        when (audioType) {
            AudioType.MP4 -> advancedMediaPlayer.playMP4(filename)
            AudioType.VLC -> advancedMediaPlayer.playVLC(filename)
            else -> println("Unknown audio type $audioType")
        }
    }
}